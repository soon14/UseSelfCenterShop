package com.example.selfshopcenter.commoncls;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

import com.example.selfshopcenter.net.CreateAddAdapter;

public class CommonData {
    //自定义一个全局变量，作为表名称，多个地方使用
    public static String    tablename="CenterTable";


    //公共的接口访问地址
    public static String    CommonUrl="http://122.112.234.28:8017/";


    public  static  String  app_version="";

    //订单流水号，命名规则为 销售日期和 一个三位的序号,这里只使用序号
    public static  int    number=1;


    public static  String     ordernumber="";  //订单流水号

    public  static  String  khid="";

    public  static  String  posid="";

    public  static  String  deviceid= Build.SERIAL;


    public  static  String khsname="";

    //当前用户选择的支付方式
     //WXPaymentCodePay  微信支付   AliPaymentCodePay  支付宝支付   WXFacePay  刷脸支付
    public  static  String payWay="";


    //支付交易单号
    public  static  String  paytrad_no="";

    public  static  String  QYID="";


    public static HyMessage  hyMessage=null;

    //public static CreateAddAdapter list_adaptor=null;

    public static OrderInfo orderInfo=null;



    //静态字段，查询购物车产品，一般仅做测试使用
    public  static String searchCar="SEARCH";
    //静态字段，增加购物车产品
    public  static String AddCar="ADD";
    //静态字段，减少购物车产品
    public  static String Reduce="REDUCE";


    //支付信息相关的,由于子商户号这些暂时用不到，所以先不写
    public  static String   zfbappid="";
    public  static String   wxappid="";
    public  static String   wxshid="";
    public  static String   appKey="";


    public  static  long   lastUpdateTime=0;

    public static CreateAddAdapter list_adaptor=null;

  //====================以下是公共方法=================================


    //获取程序的版本号
    public static int getAppVersioncode(Context context) {
        PackageManager manager = context.getPackageManager();
        int code = 0;
        try {
            PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
            code = info.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return code;
    }
    //版本号名称
    public static String getAppVersion(Context context) {
        PackageManager manager = context.getPackageManager();
        String code = "";
        try {
            PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
            code = info.versionName;

            lastUpdateTime= info.lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return code;
    }

}
