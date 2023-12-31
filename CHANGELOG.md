# 更新日志

---

## [0.5.7] - 2023-08-14

### 优化

* 优化了大量代码结构
* 添加了大量注释在事件相关的代码中

### TODO

* JScrollPanel类的UI设置, 这个UI现在巨丑无比

---

## [0.5.6] - 2023-08-03

## 优化

* 优化了创建事件窗体中"保存事件"按钮在鼠标指向和单击时的颜色表现.
* 现在创建事件窗体中的标题文本框和注释文本框会随着窗体的大小改变自己的大小.

---

## [0.5.5] - 2023-07-29

### 新增

* 在创建事件窗体中新增了一些线条用于向巨硬的日历UI靠拢.
* 在创建事件窗体中新增了一个文本框. 用来输入事件的标题.
* 在创建事件窗体中新增了一个文本区域. 还有一个滚动条.(目前还不能用)在不久的将来这个文本框将被用于输入事件的注释.

### 优化

* 优化了创建新事件窗体中标题栏文本的颜色.
* 优化了创建新事件窗体中保存事件按钮的背景颜色和文本颜色.
* 用于输入注释的文本框现在可以自动换行了.

---

## [0.5.4] - 2023-07-26

### 新增

* "展示当前年月日和选择月份"按钮有了自己的位置, 但是没有图标和内容实现.

### 修复

* 修复了一个bug, 该bug曾导致"返回今天"按钮会额外向后展示一个月份.
* 修复了一个bug, 该bug曾导致在切换月份时某些日期格子会不合时宜的展示月份或者年份信息而不是只显示日期.
* 修复了一个bug, 该bug曾导致在切换月份时代表"今日"日期格子的蓝色高亮条会在不正确的地方显示.
* 修复了一个bug, 该bug曾导致在切换月份时已经过去的日期仍然和未来的日期使用相同的背景颜色.
* 修复了一个bug, 该bug曾导致"返回今天"按钮会在某些情况下创建一个"新建事件"窗体.

---

## [0.5.3] - 2023-07-11

### 新增

* "返回今天所在的月份","上个月份","下个月份"按钮的功能实现了. 但是目前仍有大量bug

### 调整

* 调整了星期栏中部分按钮的位置. 现在它们可以随着窗体的放大和缩小改变自己的绝对位置了.

---

## [0.5.2] - 2023-07-05

### 优化

* 优化了标题栏关闭按钮图标的边缘像素.
* 重构了标题栏按钮的代码.

### 更改

* 更改了边栏和部分功能面板的黑色主题下的配色情况.
* 给标题栏的三个按钮增加了一些特技, 现在他们在点击的时候可以根据配色方案展示不同的背景颜色了.

---

## [0.5.1] - 2023-07-05

### 新增

* 新增了当前日期显示/翻页面板, 在日历面板的上方, 功能面板的下方. 但是目前没有添加到窗体中, 只是预留了位置, 也没有实现功能.

### 优化

* 优化了部分组件的rePaint方法. 减少该方法的不必要的调用次数.
* 现在打开日历时当前天所代表的日历格子会被预先点击一次. 展示为不同的颜色, 并且仅需点击一次就可以打开新建事件的面板.

### 修复

* 修复了一个bug, 该bug曾导致最大化或最小化窗体时日历面板有概率显示不正确.

---

## [0.5.0] - 2023-07-05

### 新增

* 新增了日历上方的功能面板(的位置).
* 新增了日历侧面的事件展示面板(的空白).
* 新增了一种边框.应用在了功能面板和事件展示面板上.
* 也应用在了侧面功能面板上.
* 新增了一点点野心在README.md文件中.
* 新增了一些摇摇欲坠的屎山.

### 修改

* 现在不会随着程序启动一起打开一个"新建事件"窗体了.

### 删除

* 删除了一点点矫情.

### 已知BUG

* 可能是个bug: 在拖动窗口时候MPanel类的强制类型转换似乎失败了, 但是只失败了一次. 下次再遇到这种情况就研究一下.

---

## [0.4.3] - 2023-07-05

### 新增

* 现在可以通过双击日历窗格打开"新建事件"窗体了
* "新建事件"窗体拥有了自己的名字.

### 优化

* 标题栏现在可以根据不同的参数构造不同的样式了.
* 对标题栏的部分代码重构.

### 删除

* "新建事件"窗体现在不再拥有自己的设置按钮了.

---

## [0.4.2] - 2023-07-05

### 优化

* TitlePanel的全局化.
* 大量的重构了主面板的代码.
* 添加了新建事件的面板, 但是目前没有内容和功能, 且不能通过双击按钮调用.
* 重构了新建事件的面板, 让它和主面板拥有同样的超类.
* 重构了标题面板, 让它兼容本项目的所有Frame.
* 重构了标题面板的构造函数, 让它可以选择性的添加Icon.

---

## [0.4.1] - 2023-07-05

### 优化

* 大量的重构了月日历面板的生成代码

### 更改

* 现在月日历会正常显示当前月份了.

---

## [0.4.1-dev1] - 2023-07-03

### 修复

* 修复了一个bug, 该bug曾导致月日历的排版总是按照当前年份一月的日历排序.
* 修复了一个bug, 该bug曾导致月日历的本月日历在星期天结尾时, 下个月的日历不能正确初始化
* 修复了一个bug, 该bug曾导致月日历的年份显示不正确.
* 修复了一个bug, 该bug曾导致当月日历跨年时后方日历的月份会和当月月份重合.
* 修复了一个bug, 该bug曾导致当月日历跨年时下个月的日历不能正确初始化.
* 修复了一个bug, 该bug曾导致月日历在当月日期少且月初靠近新的一周的时候下个月的日历不能正确的初始化.

### 优化

* 现在在月日历中跨年时只会展示一个年份.

### 更改

* 现在月日历只会显示1999年1月份用于测试.

---

## [0.4.0] - 2023-07-03

### 新增

* 新增了主窗体中对鼠标拖动的操作, 现在窗口可以通过拖动边沿改变窗体的大小. 但是目前只能通过拖动侧边栏的左边和下面一小部分来更改.
并且目前只支持四个正方向的拖拽操作, 不可以在侧边拖拽
* 新增了不同情况下的鼠标指针的图标:
  * 现在在窗体边缘可以执行拖拽的时候指针会被绘制成双方向的小箭头, 指向可以拖拽的方向.
  * 现在在日历面板中鼠标指向日历格子的时候指针会被绘制成手掌形.

### 优化

* 重构了主面板的更新位置的代码, 现在主面板和它的子面板们可以随着窗体的大小改变自己的大小了.
* 重构了标题栏中"填充/还原"按钮的逻辑, 现在当窗体的位置或者大小被改变时标题栏按钮将不会再继续保持"还原"状态.
* 重构了标题栏中"填充/还原"按钮的逻辑, 使在执行其功能的时候可以运行更少的代码.
* 重构了大部分UI类的rePaint()方法, 让他们的调用堆栈看起来更正常.
* 重构了主面板和其子面板的类, 他们现在拥有相同的超类, 用于在窗体变更大小的时候隐式的更改自己的大小.

---

## [0.3.0] - 2023-07-03

### 新增

* 新增本月份前一月的剩余日期和下一月的开始日期显示(如果有空位), 以匹配Outlook-Beta.
* 新增显示年份的标签和对应的方法. 在当前日历跨年时会在其后一天或前一天显示年份和月份.
* 新增显示月份的标签和对应的方法, 在当前日历跨月时会在其后一天或前一天显示月份.
* 新增高亮当前日期的方法, 当日的日期格子上方会有蓝色横条标注.


* 新增了大量的getter和setter方法, 他们混乱不堪.
* 新增了格式化年份为日历显示模式的工具类静态方法.
* 为大部分历史版本更新日志的条目增添了缺少的句号

### 优化

* 优化了日期标签在单元格中的显示位置.
* 优化了日期单元格的配色.



* 优化了MColor类的颜色分类. 
* 优化了DateGrid的部分代码实现, 使其更符合逻辑和命名规范.

### 更改

* 将更深层的日期单元格配色逻辑由"本月之前的日期"更改为"今天之前的日期"以匹配Outlook-Beta.
* 将全局的字体设置中字形由"粗体"改为"普通".


* 将部分没有全局化配色方案的颜色调用由MColor类的静态颜色常量更改为java.awt.Color类的静态颜色常量.

### 删除

* 删除了日期单元格鼠标悬停时更改配色的功能(为了和Outlook-Beta靠齐).


* 删除了所有MColor类中的静态颜色常量.

---

## [0.2.4] ~ [0.2.8] - 2023-07-03

### 新增

* 一点点矫情.

### 更改

* 更改了.gitignore文件的屏蔽项目.


---

## [0.2.3] - 2023-07-03

### 新增

* 新增了一大堆类, 用来符合OOP思想...
* 添加了日历和提醒事项功能的部分实现. 现在可以通过在侧边功能面板选择器选择该功能后在UI中展示当月日历.
* 新增了对不同UI配色下的字体颜色的支持.

### 优化

* 优化了源码的包的结构.
  * 将所有主窗体的包重构到"src/pro/base"目录下.
  * 将功能窗体中日历和提醒事项功能的相关包重构到"src/pro/calendar"目录下. 其中ui包为GUI相关代码, al包为逻辑和算法相关代码.
  * 将功能窗体中记事本功能的相关包重构到"src/pro/note"目录下, 其中ui包为GUi相关代码, al包为逻辑和算法相关代码.
* 重命名了部分类和引用的名称使其更符合命名规范.
* 重构了主面板的位置和大小的配置方式, 使其**大概**可以适配不同分辨率的客户端.

---

## [0.2.2] - 2023-07-02

### 新增

* 新增了一些类, 用来符合OOP思想. (我超o).

### 优化

* 优化了源码的包的部分结构.

### 更改

* 更改了部分目录的名字, 使其更符合命名规范.

---

## [0.2.1] - 2023-07-02

### 新增

* 新增了侧边面板和主面板的保存项. 在正常关闭窗口时保存当前展示的面板到配置文件, 重启时打开它.
* 新增了两个主功能面板: 日历面板和记事本面板. 但目前没有功能.

### 优化

* 优化了MainFrame初始化部分的代码逻辑.
* 优化了源码的包的结构.

### 删除

* 删除了MainFrame中对根面板的引用.

---

## [0.2.0] - 2023-07-02

### 新增

* 新增侧边栏功能区.
* 新增侧边栏按钮"日历"和"笔记", 和其对应的Icon.但是目前没有功能.
* 新增主面板(并没有, 留给明天吧).

### 修复

* 修复标题栏中设置按钮在鼠标靠近时没有动画的问题.

### 更改

* 更改项目名称为"Max-Box".

### 优化

* 优化TitlePanel类中的部分引用的名称, 使它们更加符合命名规范.

### 删除

* 删除仓库中项目文件里的out目录和.idea目录及其内容.

---

## [0.1.1] - 2023-07-01

### 新增

* 项目中添加了 CHANGELOG.md 文档. 学着像专业的人一样控制版本.
* 新的标题栏按钮"设置", 但是目前没有功能.
* 代码构件中增加了相关预更新的类. 但是没有代码.
* 资源文件中的小齿轮图标(从Outlook Beta截下来的), 用于设置按钮.
* 资源文件中新的退出按钮状态图标, 用于鼠标按住退出按钮时播放.
* 添加了一个不知道哪搞来的开源协议

### 修复

* 修复了在单击标题栏logo图标弹出的菜单栏中的"还原"按钮后最小化窗体后重新打开会使得标题栏控件位置不正确的问题.
* 修复了在最小化后窗体重新打开后窗体大小显示不正确.

### 变更

* 标题栏logo图标由随手画的"M"状字母改成了随手画的"logo here"

### 优化

* 将TittlePanel类中部分可以复用代码封装为方法.
* 将部分按钮的Icon由局部引用更改为全局引用. 避免每次重绘的时候都创建一个新的实例.
* 将TitlePanel类的方法reColor方法名更改为rePaint用于规范化在主框架中的依次调用.
* 修改部分引用的名称, 让它们更加符合命名规范

### 删除

* 移除了单击标题栏logo图标弹出的菜单栏中"还原"按钮的可用性.

---

## [0.1.0] - 2023-07-01

* 发布项目.