
#!/bin/bash
#name:jar包启动脚本;
#date:2019-8-26;
#author：Yu-Luozi

#此处修改脚本名称：
APP_NAME=test1.jar
#脚本菜单项
usage() {
 echo "Usage: sh 脚本名.sh [start|stop|restart|status|info]"
 exit 1
}

is_exist(){
 pid=`ps -ef|grep $APP_NAME|grep -v grep|awk '{print $2}' `
 #如果不存在返回1，存在返回0
 if [ -z "${pid}" ]; then
 return 1
 else
 return 0
 fi
}
#启动脚本
start(){
 is_exist
 if [ $? -eq "0" ]; then
 echo "${APP_NAME} is already running. pid=${pid} ."
 else
#此处注意修改jar和log文件文件位置：
 nohup java -jar /home/ckg/secnod/secnod/shell/demoTest/out/artifacts/test1/$APP_NAME > bootdolog.file   2>&1 &
#此处打印log日志：
 tail -f /home/ckg/secnod/secnod/shell/demoTest/log/bootdolog.file
 fi
}
#停止脚本
stop(){
 is_exist
 if [ $? -eq "0" ]; then
 kill -9 $pid
 else
 echo "${APP_NAME} is not running"
 fi
}
#显示当前jar运行状态
status(){
 is_exist
 if [ $? -eq "0" ]; then
 echo "${APP_NAME} is running. Pid is ${pid}"
 else
 echo "${APP_NAME} is NOT running."
 fi
}
#重启脚本
restart(){
 stop
 start
}

###################################
#(函数)打印系统环境参数
###################################
info() {
   echo "System Information:"
   echo "****************************"
   echo `head -n 1 /etc/issue`
   echo `uname -a`
   echo
   echo "JAVA_HOME=$JAVA_HOME"
   echo `$JAVA_HOME/bin/java -version`
   echo
   echo "APP_HOME=$APP_HOME"
   echo "APP_MAINCLASS=$APP_MAINCLASS"
   echo "****************************"
}


case "$1" in
 'info')
     info
     ;;
 "start")
 start
 ;;
 "stop")
 stop
 ;;
 "status")
 status
 ;;
 "restart")
 restart
 ;;
 *)
 usage
 ;;
esac
     echo "Usage: $0 {start|stop|restart|status|info}"
     exit 1
