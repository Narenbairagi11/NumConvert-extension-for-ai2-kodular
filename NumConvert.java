package com.technovedang.numconvert;

import android.content.Context;
import android.util.Log;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.ComponentCategory;

@DesignerComponent(version = 1,  description = "Created By Techno Vedang",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,   iconName = "https://community.kodular.io/user_avatar/community.kodular.io/techno_vedang/45/57521_2.png")
@SimpleObject(external = true)
public class NumConvert extends AndroidNonvisibleComponent {
    private ComponentContainer container;
    /**
     * @param container container, component will be placed in
     */
    public NumConvert(ComponentContainer container) {
        super(container.$form());
        this.container = container;
    }

    @SimpleFunction(description = "convert number")
    public String ConvertViews(int number){
        // 1
        int a = 999;
        int b = 1099;
        int c = 1200;
        int d = 1299;
        int e = 1300;
        int f = 1399;
        int g = 1400;
        int h = 1499;
        int i = 1500;
        int j = 1599;
        int k = 1600;
        int l = 1699;
        int m = 1700;
        int n = 1799;
        int o = 1800;
        int p = 1899;
        int q = 1900;
        int r = 1999;
        int s = 2000;
        int t = 2099;
        int u = 2100;
        int v = 2199;
        int w = 2200;
        int x = 2299;
        int y = 2300;
        int z = 2399;
        /* 2 */
        int aa = 2400;
        int bb = 2499;
        int cc = 2500;
        int dd = 2599;
        int ee = 2600;
        int ff = 2699;
        int gg = 2700;
        int hh = 2799;
        int ii = 2800;
        int jj = 2899;
        int kk = 2900;
        int ll = 2999;
        int mm = 3000;
        int nn = 3099;
        int oo = 3100;
        int pp = 3199;
        int qq = 3200;
        int rr = 3299;
        int ss = 3300;
        int tt = 3399;
        int uu = 3400;
        int vv = 3499;
        int ww = 3500;
        int xx = 3599;
        int yy = 3600;
        int zz = 3699;

        int aaa = 3700;
        int bbb = 3799;
        int ccc = 3800;
        int ddd = 3899;
        int eee = 3900;
        int fff = 3999;
        int ggg = 4000;
        int hhh = 4099;
        int iii = 4100;
        int jjj = 4199;
        int kkk = 4200;
        int lll = 4299;
        int mmm = 4300;
        int nnn = 4399;
        int ooo = 4400;
        int ppp = 4499;
        int qqq = 4500;
        int rrr = 4599;
        int sss = 4600;
        int ttt = 4699;
        int uuu = 4700;
        int vvv = 4799;
        int www = 4800;
        int xxx = 4899;
        int yyy = 4900;
        int zzz = 4999;

        int aaaa= 5000;


        if(number < b && number > a){
            return "1k+";
        } else if (number < a){
            return "number";
        } else if(number > b && number < c){
            return "1.1k+";
        }else if(number > b && number < d){
            return "1.2k+";
        }else if(number > d && number < g){
            return "1.3k+";
        }else if (number > f && number < i){
            return "1.4k+";
        }else if(number > h && number < k){
            return "1.5k+";
        }else if(number > j && number < m){
            return "1.6k+";
        }else if(number > l && number < o){
            return "1.7k+";
        }else if(number > n && number < q){
            return "1.8k+";
        }else if(number > p && number < s){
            return "1.9k+";
        }else if (number > r && number < u){
            return "2k+";
        }else if(number > t && number < w){
            return "2.1k+";
        }else if(number > v && number < y){
            return "2.2k+";
        }else if(number > x && number < aa){
            return "2.3k+";
        }else {
            return "number > 2.3k";
        }

    }
}