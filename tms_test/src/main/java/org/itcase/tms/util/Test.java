package org.itcase.tms.util;/*
 *ClassName:Test
 *UserName:小阎王丷
 *CreateTime:2020/9/23 11:13
 */



import org.itcase.tms.dao.CityDao;
import org.itcase.tms.dao.NodeDao;
import org.itcase.tms.dao.TmsCityDao;
import org.itcase.tms.dto.NodeDto;
import org.itcase.tms.dto.NodesDto;
import org.itcase.tms.mail.MailUtil;
import org.itcase.tms.pojo.Page;


import javax.mail.MessagingException;
import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;


public class Test {
    public static void main(String[] args) {
//        UserDao dao=new UserDao();
        //List<Emp> list= dao.getemps();
        // System.out.println(list);
        //int a=dao.insert("小将","80000","男");
        // System.out.println(a);
        // int b=dao.delect(8);
        // System.out.println(b);
        //int c= dao.update(2,"小五","5600","女");
        // System.out.println(c);
//        FootDao f=new FootDao();
//        List<Foot> list=f.select1(1,null,null,0,null,0,null);
//        System.out.println(list.get(0));
//        ADao a=new ADao();
//        A a1=new A(11,"小五","11");
//       int m= a.addA1(a1);
//        System.out.println(m);
//        MydeptDao dao=new MydeptDao();
        //插入
//        Mydept my=new Mydept(3,"徐","长沙岳麓区",21,"男");
//        int a=dao.addMydept(my);
//        System.out.println(a);
        //删除
//         int n=dao.deleteMydept(4);
//        System.out.println(n);
        //修改
//        Mydept my=new Mydept(5,"谢家豪","长沙岳麓区",20,"男");
//       int n= dao.updateMydept(my);
//        System.out.println(n);
        //查询
//       List<Mydept> a= dao.selectMydept1(0,null,null,21,null);
//        System.out.println(a);
//        OrgsDao or=new OrgsDao();
//        List<Orgs> list=or.getOrgs();
//        System.out.println(list);
        // UserDao dao=new UserDao();
        // Account account= dao.checkAccount1(1,null,null);
        // int n=dao.addAccount("小张","1586@qq.com","1234567");
        // System.out.println(account);
        //  System.out.println(n);

//        try {
//            MailUtil.send_mail("itookapillincj@163.com","激活");
//            System.out.println("511");
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }


//        UserDao dao=new UserDao();
//       int n= dao.updatestate("xj@qq.com");
//        System.out.println(n);
//        CityDao dao = new CityDao();
//        List<City_info> list = dao.selectCity();
//        System.out.println(list);
        //CityDao dao=new CityDao();
//        Page<City_info> page= dao.getCity(1,5,"长沙");
//        List<City_info> list=page.getList();
//        for(City_info a:list){
//            System.out.print("ID:"+a.getId()+"  状态:"+a.getCity_state()+"  城市代码："+a.getCity_code()+"  城市名称："+a.getCity_name()+"  机构名称："+a.getOrg_name()+"  运输中心："+a.getD_center());
//            System.out.println();
//        }
//        System.out.print("当前页:"+page.getPageNo()+" ");
//        System.out.print("共"+page.getTotalPages()+"页 ");
//        System.out.print("首页:"+page.getTopPageNo()+" ");
//        System.out.print("上一页:"+page.getPreviousPageNo()+" ");
//        System.out.print("下一页:"+page.getNextPageNo()+" ");
//        System.out.print("尾页:"+page.getBottomPageNo()+" ");
//        //System.out.print("共"+page.getTotalRecords()+"条记录");
//        System.out.println();
        // int n=dao.updateCity("常宁","2","CNX",18);
        // System.out.println(n);
//        String s="fmn";
//        String t=s.toUpperCase();
//        System.out.println(s);
//        System.out.println(t);
//        String y=s.replace('f','F');
//        y=y+"wxy";
//        System.out.println(y);
//       NodeDao dao=new NodeDao();
//        Page<NodesDto> page=dao.getNode(1,3,null,"节点",null);
//        List<NodesDto> list=page.getList();
//        //System.out.println(list);
//        for(NodesDto a:list){
//            System.out.print("ID:"+a.getId()+"  状态:"+a.getNode_state()+"  城市代码："+a.getCity_code()+"  城市名称："+a.getCity_name()+"  机构名称："+a.getOrg_name()+"  运输中心："+a.getD_center()+" 节点类型: "+a.getNode_type()+" 节点名称: "+a.getNode_name());
//            System.out.println();
//        }
//        System.out.print("当前页:"+page.getPageNo()+" ");
//        System.out.print("共"+page.getTotalPages()+"页 ");
//        System.out.print("首页:"+page.getTopPageNo()+" ");
//        System.out.print("上一页:"+page.getPreviousPageNo()+" ");
//        System.out.print("下一页:"+page.getNextPageNo()+" ");
//        System.out.print("尾页:"+page.getBottomPageNo()+" ");
//
//
//        CityDao dao=new CityDao();
//        List list= dao.getNodestate(1);
//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println();
//        for (int i = 0; i <list.size()-1 ; i++) {
//            if (list.get(i).getNode_state().equals("0")){

        //            }
//        }
//        Iterator<NodeDto> iterator=list.iterator();
//        while (iterator.hasNext()){
//            NodeDto dto=iterator.next();
//            System.out.println(dto);
//           if ("0".equals(dto.getNode_state())){
//               count++;
//               if (count==lenth){
//                   System.out.println("已作废");
//               }
//           }else{
//               System.out.println("不能作废");
//               break;
//           }
//
//        }
//        int  n= dao.cancellationCity(1);
//        System.out.println(n);
//    }
//        NodeDao dao=new NodeDao();
//       int id=  dao.getNodeId("节点") ;
//        System.out.println(id);
    }

}