package cz.tomkren;

import cz.tomkren.kutil2.KutilMain;

/** Created by pejsek on 12.7.2015. */

public class DagDrawer {

    public static void main(String[] args) {

        // wine
        // KutilMain.showDag("<o id=\"$v_4654235\" shape=\"f 1 1 PCA $v_4654236:0\"\t pos=\"426 132\"/>\n<o id=\"$v_4654236\" shape=\"f 1 4 kMeans $v_4654238:0 $v_4654237:0 $v_4654240:0 $v_4654239:0\"\t pos=\"426 196\"/>\n<o id=\"$v_4654240\" shape=\"f 1 1 gaussianNB $v_4654251:2\"\t pos=\"650 388\"/>\n<o id=\"$v_4654239\" shape=\"f 1 1 SVC $v_4654251:3\"\t pos=\"714 388\"/>\n<o id=\"$v_4654238\" shape=\"f 1 1 gaussianNB $v_4654251:0\"\t pos=\"138 388\"/>\n<o id=\"$v_4654237\" shape=\"f 1 4 copy $v_4654243:0 $v_4654242:0 $v_4654241:0 $v_4654244:0\"\t pos=\"394 260\"/>\n<o id=\"$v_4654244\" shape=\"f 1 1 gaussianNB $v_4654245:3\"\t pos=\"586 388\"/>\n<o id=\"$v_4654243\" shape=\"f 1 1 gaussianNB $v_4654245:0\"\t pos=\"202 388\"/>\n<o id=\"$v_4654242\" shape=\"f 1 1 SVC $v_4654245:1\"\t pos=\"266 388\"/>\n<o id=\"$v_4654241\" shape=\"f 1 4 kMeans $v_4654247:0 $v_4654246:0 $v_4654249:0 $v_4654248:0\"\t pos=\"426 324\"/>\n<o id=\"$v_4654251\" shape=\"f 4 1 vote\"\t pos=\"426 580\"/>\n<o id=\"$v_4654247\" shape=\"f 1 1 SVC $v_4654250:0\"\t pos=\"330 388\"/>\n<o id=\"$v_4654246\" shape=\"f 1 1 gaussianNB $v_4654250:1\"\t pos=\"394 388\"/>\n<o id=\"$v_4654245\" shape=\"f 4 1 vote $v_4654251:1\"\t pos=\"394 516\"/>\n<o id=\"$v_4654249\" shape=\"f 1 1 gaussianNB $v_4654250:2\"\t pos=\"458 388\"/>\n<o id=\"$v_4654248\" shape=\"f 1 1 SVC $v_4654250:3\"\t pos=\"522 388\"/>\n<o id=\"$v_4654250\" shape=\"f 4 1 vote $v_4654245:2\"\t pos=\"426 452\"/>\n");

        // wilt
        /*KutilMain.showDag(
            "<o id=\"$v_4748023\" shape=\"f 1 3 copy $v_4748024:0 $v_4748025:0 $v_4748026:0\"\t pos=\"490 132\"/>\n" +
            "<o id=\"$v_4748024\" shape=\"f 1 1 SVC(10,1.0E-4,1.0E-4) $v_4748042:0\"\t pos=\"138 388\"/>\n" +
            "<o id=\"$v_4748025\" shape=\"f 1 1 SVC{15,0.001,0.01) $v_4748042:1\"\t pos=\"202 388\"/>\n" +
            "<o id=\"$v_4748026\" shape=\"f 1 4 kMeans $v_4748029:0 $v_4748030:0 $v_4748027:0 $v_4748028:0\"\t pos=\"554 196\"/>\n" +
            "<o id=\"$v_4748027\" shape=\"f 1 1 SVC(5,0.01,1.0E-4) $v_4748035:2\"\t pos=\"778 388\"/>\n" +
            "<o id=\"$v_4748028\" shape=\"f 1 1 gaussianNB $v_4748035:3\"\t pos=\"842 388\"/>\n" +
            "<o id=\"$v_4748029\" shape=\"f 1 4 kMeans $v_4748034:0 $v_4748031:0 $v_4748032:0 $v_4748033:0\"\t pos=\"458 260\"/>\n" +
            "<o id=\"$v_4748030\" shape=\"f 1 1 SVC(10,1.0E-4,1.0E-4) $v_4748035:1\"\t pos=\"714 388\"/>\n" +
            "<o id=\"$v_4748031\" shape=\"f 1 1 DT(entropy,0.75,100,10,2) $v_4748040:1\"\t pos=\"330 388\"/>\n" +
            "<o id=\"$v_4748032\" shape=\"f 1 1 SVC(15,0.001,0.01) $v_4748040:2\"\t pos=\"394 388\"/>\n" +
            "<o id=\"$v_4748033\" shape=\"f 1 4 copy $v_4748037:0 $v_4748038:0 $v_4748039:0 $v_4748036:0\"\t pos=\"554 324\"/>\n" +
            "<o id=\"$v_4748034\" shape=\"f 1 1 SVC(15,0.01,1.0E-4) $v_4748040:0\"\t pos=\"266 388\"/>\n" +
            "<o id=\"$v_4748035\" shape=\"f 4 1 vote $v_4748042:2\"\t pos=\"554 580\"/>\n" +
            "<o id=\"$v_4748036\" shape=\"f 1 1 gaussianNB $v_4748041:3\"\t pos=\"650 388\"/>\n" +
            "<o id=\"$v_4748037\" shape=\"f 1 1 DT(entropy,0.1,50,2,20) $v_4748041:0\"\t pos=\"458 388\"/>\n" +
            "<o id=\"$v_4748038\" shape=\"f 1 1 SVC(1,0.01,0.001) $v_4748041:1\"\t pos=\"522 388\"/>\n" +
            "<o id=\"$v_4748039\" shape=\"f 1 1 logR(0.5,l2,1.0E-4) $v_4748041:2\"\t pos=\"586 388\"/>\n" +
            "<o id=\"$v_4748040\" shape=\"f 4 1 vote $v_4748035:0\"\t pos=\"458 516\"/>\n" +
            "<o id=\"$v_4748041\" shape=\"f 4 1 vote $v_4748040:3\"\t pos=\"554 452\"/>\n" +
            "<o id=\"$v_4748042\" shape=\"f 3 1 vote\"\t pos=\"490 644\"/>\n" );*/

        KutilMain.showDag(
                        "  <o id=\"$v_4748023\" pos=\"490 132\" shape=\"f 1 3 copy $v_4748024:0 $v_4748025:0 $v_4748026:0\"/>\n" +
                        "  <o id=\"$v_4748026\" pos=\"554 196\" shape=\"f 1 4 kMeans $v_4748029:0 $v_4748030:0 $v_4748027:0 $v_4748028:0\"/>\n" +
                        "  <o id=\"$v_4748029\" pos=\"458 260\" shape=\"f 1 4 kMeans $v_4748034:0 $v_4748031:0 $v_4748032:0 $v_4748033:0\"/>\n" +
                        "  <o id=\"$v_4748033\" pos=\"554 324\" shape=\"f 1 4 copy $v_4748037:0 $v_4748038:0 $v_4748039:0 $v_4748036:0\"/>\n" +
                        "  <o id=\"$v_4748035\" pos=\"554 580\" shape=\"f 4 1 vote $v_4748042:2\"/>\n" +
                        "  <o id=\"$v_4748040\" pos=\"458 516\" shape=\"f 4 1 vote $v_4748035:0\"/>\n" +
                        "  <o id=\"$v_4748042\" pos=\"490 644\" shape=\"f 3 1 vote\"/>\n" +
                        "  <o id=\"$v_4748039\" pos=\"596 384\" shape=\"f 1 1 logR(0.5,l2,1.0E-4) $v_4748041:2\"/>\n" +
                        "  <o id=\"$v_4748041\" pos=\"551 456\" shape=\"f 4 1 vote $v_4748040:3\"/>\n" +
                        "  <o id=\"$v_4748038\" pos=\"534 402\" shape=\"f 1 1 SVC(1,0.01,0.001) $v_4748041:1\"/>\n" +
                        "  <o id=\"$v_4748037\" pos=\"462 384\" shape=\"f 1 1 DT(entropy,0.1,50,2,20) $v_4748041:0\"/>\n" +
                        "  <o id=\"$v_4748036\" pos=\"657 401\" shape=\"f 1 1 gaussianNB $v_4748041:3\"/>\n" +
                        "  <o id=\"$v_4748032\" pos=\"390 401\" shape=\"f 1 1 SVC(15,0.001,0.01) $v_4748040:2\"/>\n" +
                        "  <o id=\"$v_4748031\" pos=\"314 383\" shape=\"f 1 1 DT(entropy,0.75,100,10,2) $v_4748040:1\"/>\n" +
                        "  <o id=\"$v_4748034\" pos=\"236 400\" shape=\"f 1 1 SVC(15,0.01,1.0E-4) $v_4748040:0\"/>\n" +
                        "  <o id=\"$v_4748025\" pos=\"171 383\" shape=\"f 1 1 SVC{15,0.001,0.01) $v_4748042:1\"/>\n" +
                        "  <o id=\"$v_4748024\" pos=\"104 400\" shape=\"f 1 1 SVC(10,1.0E-4,1.0E-4) $v_4748042:0\"/>\n" +
                        "  <o id=\"$v_4748030\" pos=\"726 383\" shape=\"f 1 1 SVC(10,1.0E-4,1.0E-4) $v_4748035:1\"/>\n" +
                        "  <o id=\"$v_4748027\" pos=\"796 400\" shape=\"f 1 1 SVC(5,0.01,1.0E-4) $v_4748035:2\"/>\n" +
                        "  <o id=\"$v_4748028\" pos=\"856 383\" shape=\"f 1 1 gaussianNB $v_4748035:3\"/>");



        // magic
        //s param v1
        // KutilMain.showDag("<o id=\"$v_533529\" shape=\"f 1 1 PCA{whiten:true,feat_frac:1} $v_533530:0\"\t pos=\"202 132\"/>\n<o id=\"$v_533530\" shape=\"f 1 3 copy $v_533531:0 $v_533532:0 $v_533533:0\"\t pos=\"202 196\"/>\n<o id=\"$v_533531\" shape=\"f 1 1 SVC{tol:0.01,C:10,gamma:0} $v_533534:0\"\t pos=\"138 260\"/>\n<o id=\"$v_533532\" shape=\"f 1 1 SVC{tol:1.0E-4,C:0.5,gamma:0.1} $v_533534:1\"\t pos=\"202 260\"/>\n<o id=\"$v_533533\" shape=\"f 1 1 SVC{tol:0.01,C:2,gamma:0.5} $v_533534:2\"\t pos=\"266 260\"/>\n<o id=\"$v_533534\" shape=\"f 3 1 vote\"\t pos=\"202 324\"/>\n");

        //s param v2
        /*KutilMain.showDag("<o id=\"$v_533529\" shape=\"f 1 1 PCA(true,1) $v_533530:0\"\t pos=\"202 132\"/>\n" +
                "<o id=\"$v_533530\" shape=\"f 1 3 copy $v_533531:0 $v_533532:0 $v_533533:0\"\t pos=\"202 196\"/>\n" +
                "<o id=\"$v_533531\" shape=\"f 1 1 SVC(10,0,0.01) $v_533534:0\"\t pos=\"138 260\"/>\n" +
                "<o id=\"$v_533532\" shape=\"f 1 1 SVC(0.5,0.1,1.0E-4) $v_533534:1\"\t pos=\"202 260\"/>\n" +
                "<o id=\"$v_533533\" shape=\"f 1 1 SVC(2,0.5,0.01) $v_533534:2\"\t pos=\"266 260\"/>\n" +
                "<o id=\"$v_533534\" shape=\"f 3 1 vote\"\t pos=\"202 324\"/>\n");*/


        //"json": "{'input':[[],'input',['533529:0']],'533529':[['533529:0'],
        // ['PCA',{'whiten':true,'feat_frac':1}],['533530:0']],'533530':[['533530:0'],
        // ['copy',{}],['533531:0','533532:0','533533:0']],'533531':[['533531:0'],
        // ['SVC',{'tol':0.01,'C':10,'gamma':0}],['533534:0']],'533532':[['533532:0'],
        // ['SVC',{'tol':1.0E-4,'C':0.5,'gamma':0.1}],['533534:1']],'533533':[['533533:0'],
        // ['SVC',{'tol':0.01,'C':2,'gamma':0.5}],['533534:2']],'533534':[['533534:0','533534:1','533534:2'],
        // ['vote',{}],[]]}"

        // ml-prove
        //KutilMain.showDag("<o id=\"$v_2254223\" shape=\"f 1 5 copy $v_2254227:0 $v_2254225:0 $v_2254226:0 $v_2254224:0 $v_2254228:0\"\t pos=\"522 132\"/>\n<o id=\"$v_2254226\" shape=\"f 1 1 SVC $v_2254241:2\"\t pos=\"266 324\"/>\n<o id=\"$v_2254227\" shape=\"f 1 1 SVC $v_2254241:0\"\t pos=\"138 324\"/>\n<o id=\"$v_2254224\" shape=\"f 1 5 copy $v_2254233:0 $v_2254230:0 $v_2254232:0 $v_2254231:0 $v_2254229:0\"\t pos=\"586 196\"/>\n<o id=\"$v_2254225\" shape=\"f 1 1 DT $v_2254241:1\"\t pos=\"202 324\"/>\n<o id=\"$v_2254228\" shape=\"f 1 1 DT $v_2254241:4\"\t pos=\"906 324\"/>\n<o id=\"$v_2254241\" shape=\"f 5 1 vote\"\t pos=\"522 516\"/>\n<o id=\"$v_2254230\" shape=\"f 1 5 kMeans $v_2254234:0 $v_2254238:0 $v_2254239:0 $v_2254235:0 $v_2254237:0\"\t pos=\"522 260\"/>\n<o id=\"$v_2254231\" shape=\"f 1 1 DT $v_2254236:3\"\t pos=\"778 324\"/>\n<o id=\"$v_2254229\" shape=\"f 1 1 logR $v_2254236:4\"\t pos=\"842 324\"/>\n<o id=\"$v_2254232\" shape=\"f 1 1 DT $v_2254236:2\"\t pos=\"714 324\"/>\n<o id=\"$v_2254233\" shape=\"f 1 1 DT $v_2254236:0\"\t pos=\"330 324\"/>\n<o id=\"$v_2254234\" shape=\"f 1 1 gaussianNB $v_2254240:0\"\t pos=\"394 324\"/>\n<o id=\"$v_2254235\" shape=\"f 1 1 SVC $v_2254240:3\"\t pos=\"586 324\"/>\n<o id=\"$v_2254238\" shape=\"f 1 1 DT $v_2254240:1\"\t pos=\"458 324\"/>\n<o id=\"$v_2254239\" shape=\"f 1 1 SVC $v_2254240:2\"\t pos=\"522 324\"/>\n<o id=\"$v_2254236\" shape=\"f 5 1 vote $v_2254241:3\"\t pos=\"586 452\"/>\n<o id=\"$v_2254237\" shape=\"f 1 1 SVC $v_2254240:4\"\t pos=\"650 324\"/>\n<o id=\"$v_2254240\" shape=\"f 5 1 vote $v_2254236:1\"\t pos=\"522 388\"/>\n");

    }
}
