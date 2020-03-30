package com.xatu.Test;

/**
 * @Auther WeiLGHui
 * @Date 2020-03-30 12:33
 */
/**
 * Java基础：黄金分割点问题
 * 寻找某两个数相除，其结果离黄金分割点0.618最近
 *
 * 要求：1.分母和分子不能同时为偶数
 *       2.分母和分子取值范围在[1-20]
 */

public class TestGolden_section {
    public static void main(String[] args) {
        double chushu = 0;   //分子
        double beichushu = 1;   //分母
        double min = 1;    //用来存最小值
        for (double i = 1; i < 21; i++) {
            for (double j = i+1; j < 21; j++) {
                if(i % 2 !=0 || j % 2 != 0){
                    double abs = Math.abs(i / j - 0.618);    //得到商与0.618的差
                    if(min > abs){
                        min = abs;
                        chushu = i;
                        beichushu = j;
                    }
                }
            }
        }
        System.out.println("离黄金分割点最近的两个数相除是："+ (int)chushu + "/" + (int)beichushu + "=" + (chushu/beichushu));
    }
}
