package kopo.poly.controller;

import kopo.poly.dto.NoticeDTO;
import kopo.poly.service.INoticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class NoticeController {

    private final INoticeService noticeService;


    @GetMapping(value = "insert")//회원가입 실행창
    public String insert() throws Exception {

        log.info(this.getClass().getName() + "insert start");
        log.info(this.getClass().getName() + "insert end");

        return "/notice/insert";
    }


    @GetMapping(value = "insert_st") // 회원가입 insert 로직 실행
    public String insert_st(HttpServletRequest request, ModelMap model) throws Exception {

        log.info(this.getClass().getName() + "insert_st start");

        String name = request.getParameter("user_name");
        log.info("name" + name);

        String sex = request.getParameter("user_gender");
        log.info("user_gender" + sex);

        String id = request.getParameter("user_id");
        log.info("id" + id);

        String pwd = request.getParameter("user_pwd");
        log.info("pwd" + pwd);

        String email = request.getParameter("user_email");
        log.info("email" + email);


        NoticeDTO mDTO = new NoticeDTO();

        mDTO.setUser_name(name);
        mDTO.setUser_gender(sex);
        mDTO.setUser_id(id);
        mDTO.setUser_pwd(pwd);
        mDTO.setUser_email(email);

        int res = noticeService.insert(mDTO);

        log.info("res값" + res);

        String msg ="";
        String url ="";

        if (res == 1){
            msg ="회원가입 성공!";
            url ="/notice/login";
        }else{
            msg ="회원가입 실패";
            url ="/notice/insert";
        }

        model.addAttribute("msg",msg);
        model.addAttribute("url",url);

        log.info(this.getClass().getName() + "insert_st end");

        return "/redirect";
    }

    @GetMapping(value = "login") // 로그인창
    public String NoticeLogin()throws Exception{
        log.info(this.getClass().getName() + "NoticeLogin start");
        log.info(this.getClass().getName() + "NoticeLogin end");

        return "/notice/login";
    }


   @PostMapping(value = "login_st")  // 로그인 select문
    public String Login_st(HttpServletRequest request, HttpSession session, ModelMap model)throws Exception {

       log.info(this.getClass().getName() + " login_st Start !!");

       String id = request.getParameter("id");
       String password = request.getParameter("password");
       log.info("id값" + id);
       log.info("비밀번호" + password);


       NoticeDTO mDTO = new NoticeDTO();
       mDTO.setUser_id(id);
       mDTO.setUser_pwd(password);

       NoticeDTO result = noticeService.login(mDTO);


       String url = "";
       String msg = "";


       if (result == null) {
           msg = "로그인 실패";
           url = "/login";
       } else {
           session.setAttribute("USER", result);
           msg = "로그인성공";
           url = "/notice/board";
       }

       model.addAttribute("url", url);
       model.addAttribute("msg", msg);

       return "/redirect";
   }




    @GetMapping(value = "update") // 수정하기
    public String update() throws Exception {

        log.info(this.getClass().getName() + "update start");
        log.info(this.getClass().getName() + "update end");

        return "/notice/update";
    }

    @GetMapping(value = "update_st") // 수정하기 update문 실행
    public String update_st(HttpServletRequest request, Model model) throws Exception {

        NoticeDTO mDTO = new NoticeDTO();

        mDTO.setUser_name(request.getParameter("user_name"));
        mDTO.setUser_gender(request.getParameter("user_gender"));
        mDTO.setUser_id(request.getParameter("user_id"));
        mDTO.setUser_pwd(request.getParameter("user_pwd"));
        mDTO.setUser_email(request.getParameter("user_email"));

        log.info("name : " + mDTO.getUser_name());
        log.info("user_gender : " + mDTO.getUser_gender());
        log.info("id : " + mDTO.getUser_id());
        log.info("userPassword  " + mDTO.getUser_pwd());
        log.info("userEmail : " + mDTO.getUser_email());

        int res = noticeService.update(mDTO);

        log.info("res값" + res);

        String msg ="";
        String url ="/notice/update";

        if (res == 1){
            msg ="수정 성공!";
        }else{
            msg ="수정 실패";
        }

        model.addAttribute("msg", msg);
        model.addAttribute("url", url);



        log.info(this.getClass().getName() + "update_st end");

        return "/redirect";
    }


    @GetMapping(value = "delete") //delete문 실행
    public String delete() throws Exception {

        log.info(this.getClass().getName() + "delete start");

        noticeService.delete();


        log.info(this.getClass().getName() + "delete end");

        return "/notice/login";
    }

    @GetMapping(value = "NoticeBoard")
    public String NoticeBoard(Model model) throws  Exception{

        log.info(this.getClass().getName() + "NoticeBoard Start");
        List<NoticeDTO>rList = noticeService.getNoticeList();

        if(rList==null){
            rList = new ArrayList<>();
        }


        log.info(this.getClass().getName() + "NoticeBoard End");

        model.addAttribute("List", rList);



        return "/notice/board";
    }






}


