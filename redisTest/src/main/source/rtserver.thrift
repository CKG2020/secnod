#!/usr/local/bin/thrift -gen java rtserver.thrift
namespace java org.thrift.idl
struct CommonRet{
  1:string operationCode;
  2:string mobile;
  3:string mode;
  4:string status;
  5:string time
}
struct MsgObject{
  1:string operationCode;
  2:string mobile;
  3:string mode;
  4:string type;
  5:string time;
  6:map<string,string> protocalmap
}
service IProtocalService{
  bool commonAnswer(1:CommonRet commonRet);
  bool upData(1:MsgObject msgObject)
}