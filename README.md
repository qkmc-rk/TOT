# TOT

## TOT portal web project
### 开发流程
1. 数据库设计
2. 框架搭建
3. 服务实现
4. 前后端整合
***  
### 注意事项
1. log文件夹用于记录日志.目录结构为 [2017-05-xx]--->[姓名]--->xxx.md
2. 必须使用markdown文件记录

> 前期任务安排

- 学会使用github进行团队协作
- 学会使用编辑器进行基本的编辑

> 更新

- 搭建了maven目录，spring + spring mvc测试未发现异常,mybatis未配置
- 使用eclipse + maven 3.5.0 插件（非eclipse自带）

> 开发环境
- eclipse neon
- maven 3.5.0(下载apache官方的maven插件,在添加到eclipse,书中不建议用eclipse自带的插件,版本问题)
- jdk 1.8
- git bash

> eclipse maven项目导入方式
- 以下仅代表个人观点,不代表标准步骤,请思考之
###eclipse项目属性配置###
1. 配置eclipse的installed jres为jdk1.8中的版本,不要使用单独的jre
2. 配置项目属性的build path: main/java main/resource  test/java  test/resource
3. 配置java compiler版本1.8
4. project facets 中:添加 tomacat9, dynamic web module默认3.1, java版本1.8 javascript1.0版本
5. 其它视情况而定
      # 以上
