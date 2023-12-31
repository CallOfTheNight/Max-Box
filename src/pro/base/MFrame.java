package pro.base;

import tools.MColor;
import tools.PropertiesReader;

import javax.swing.*;
import java.awt.*;

/**
 * <h2>
 *  个性化一点的JFrame. 这是所有本程序使用的Frame的共同超类
 * </h2>
 * <p>
 *  这个Frame取消了自带的标题栏, 并且自定义了一个标题栏. 让他的配色更加"现代"
 *
 * </p>
 *
 * @author Max
 * @date 2023/07/05 19:47
 **/
public class MFrame extends JFrame {

    /**
     * 标题栏面板
     */
    public TitlePanel titlePanel;

    /**
     * 用于修改窗体大小的工具类
     */
    private ResizeAdapter resizeAdapter;

    /**
     * UI目前是否是全屏状态. 用于TitlePanel中控制最大化按钮的行为
     */
    public boolean isFullScreen;


    /**
     * 默认的构造函数, 使用这个构造函数创建本类对象会创建一个没有标题文本或者图片的窗体
     */
    public MFrame(){

        titlePanel = new TitlePanel();
        init();
    }

    public MFrame(String titleText){

        titlePanel = new TitlePanel(titleText);
        init();
    }

    public MFrame(ImageIcon icon){
        titlePanel = new TitlePanel(icon);
        init();
    }

    public void setIcon(ImageIcon icon){
        titlePanel.setIcon(icon);
    }

    /**
     * 设置顶部标题栏中文字的颜色
     * @param color 文字的颜色
     */
    public void setTitleTextColor(Color color){
        titlePanel.setTextColor(color);
    }

    /**
     * 构造函数调用的初始化函数, 用于设置所有本类对象都相同的参数
     */
    private void init(){
        //设置退出按钮
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //去边框
        this.setUndecorated(true);

        //用于设置在窗体的边框取消后仍然可以拉伸
        resizeAdapter = new ResizeAdapter(this);

        //添加监听
        this.addMouseListener(resizeAdapter);
        this.addMouseMotionListener(resizeAdapter);

        //设置背景颜色
        this.getContentPane().setBackground(MColor.MAIN_PANEL);

        //使用绝对布局管理器
        this.setLayout(null);

        this.add(titlePanel);
    }

    /**
     * 对UI界面上色
     * <p>
     * 从配置文件中调用UI的主题类型来获得不同的颜色集
     */
    private void rePaint() {
        //设置UI配色
        this.updateIsFullScreen();
    }

    /**
     * 让子窗体回调用的函数, 用来调整窗口的大小.
     * @param state 设置窗体状态的常量
     * @see JFrame#NORMAL
     */
    public void reState(int state) {
        this.setExtendedState(state);

        if (state == JFrame.NORMAL) {
            this.isFullScreen = false;

        }

        if (state == JFrame.MAXIMIZED_BOTH) {
            this.setLocation(0,0);
            this.isFullScreen = true;
        }

        this.rePaintAll();
    }

    /**
     * 当窗体大小改变时, 通过这个函数修改内部控件的大小
     * <p>
     * 这要求所有子控件都重写repaint方法来重绘他们的大小
     * </p>
     */
    public void rePaintAll() {

        this.rePaint();
        this.titlePanel.rePaint();

    }

    /**
     * 设置窗体是否可以通过拖动边框调整大小
     * @param isResizeable true for can resize
     */
    public void setResizeable(boolean isResizeable){

        if(isResizeable){
            //如果当前窗体没有相关的事件则添加事件
            if(this.getMouseListeners().length == 0 &&
            this.getMouseMotionListeners().length == 0){

                //添加监听
                this.addMouseListener(resizeAdapter);
                this.addMouseMotionListener(resizeAdapter);
            }

        }else{
            if(this.getMouseListeners().length != 0 &&
                this.getMouseMotionListeners().length != 0){

                this.removeMouseListener(resizeAdapter);
                this.removeMouseMotionListener(resizeAdapter);
            }
        }
    }


    /**
     * 更新该窗体是否是全屏状态
     */
    private void updateIsFullScreen(){

        int oriWidth = Integer.parseInt(PropertiesReader.get("ScreenWidth"));
        int oriHeight = Integer.parseInt(PropertiesReader.get("ScreenHeight"));


        //这个表达式大概意思就是如果这个窗体的坐标不在0,0. 或者他的大小和初始化窗体时检测的屏幕大小不一致就将值置为false
        if(this.getX() == 0 && this.getY() == 0 &&
                this.getWidth() == oriWidth &&
                this.getHeight() == oriHeight){
            this.setFullScreen(true);
            return;
        }
        this.setFullScreen(false);

    }

    public boolean isFullScreen() {
        return isFullScreen;
    }

    public void setFullScreen(boolean isFullScreen){
        this.isFullScreen = isFullScreen;
    }

    public void exit(){
    }

    @Override
    public void repaint() {
        this.rePaintAll();
        super.repaint();
    }
}
