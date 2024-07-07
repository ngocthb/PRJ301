package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ngocthb.model.Course;
import java.util.List;
import ngocthb.dao.CourseDAO;
import ngocthb.model.UserDTO;
import ngocthb.model.UserDTO;

public final class home_005fad_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Home Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"View/Css/home_ad.css\" />\n");
      out.write("        <link href=\"View/Img/logo.png\" rel=\"shortcut icon\" type=\"image/x-icon\" />\n");
      out.write("        <link href=\"View/Img/logo.png\" rel=\"apple-touch-icon\" />\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                -webkit-font-smoothing: antialiased;\n");
      out.write("                -moz-osx-font-smoothing: grayscale;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"banner\">\n");
      out.write("            <div>\n");
      out.write("                <div class=\"notice-text\">\n");
      out.write("                    TTK * Piano specializes in teaching piano, guitar and drawing.\n");
      out.write("                    <a href=\"search-csr-result.jsp\" class=\"white-link\">Booking Now</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </br>\n");
      out.write("        ");

            UserDTO loginUser = (UserDTO) session.getAttribute("LOGIN_USER");
            String search = request.getParameter("search");
            if (search == null) {
                search = "";
            }
            String cata = request.getParameter("cata");
            if (cata == null) {
                cata = "";
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"navigation-container\">\n");
      out.write("            <div class=\"navigation-left\">\n");
      out.write("                <img src=\"View/Img/logo.svg\" width=\"80\" alt=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navigation-right\">\n");
      out.write("                <div class=\"menu-button w-nav-button\">\n");
      out.write("                    <div class=\"icon w-icon-nav-menu\"></div>\n");
      out.write("                </div>\n");
      out.write("                <nav role=\"navigation\" class=\"nav-menu w-nav-menu\">\n");
      out.write("                    <a\n");
      out.write("                        href=\"home_ad.jsp\"\n");
      out.write("                        aria-current=\"page\"\n");
      out.write("                        class=\"nav-link w-nav-link w--current\"\n");
      out.write("                        >Home</a\n");
      out.write("                    ><a href=\"carts.jsp\" class=\"nav-link w-nav-link\"\n");
      out.write("                        >Cart</a\n");
      out.write("                    >\n");
      out.write("                    <a href=\"contact.jsp\" class=\"nav-link w-nav-link\"\n");
      out.write("                       >Contact</a>\n");
      out.write("\n");
      out.write("                    ");

                        if (loginUser != null) {
                    
      out.write("\n");
      out.write("                    <a href=\"account.jsp\" class=\"avatar nav-link w-nav-link\"><img src=\"View/Img/user-avatar.svg\" alt=\"Avatar\"></a>                             \n");
      out.write("                        ");
 } else {
                        
      out.write("\n");
      out.write("                    <a href=\"login.jsp\" class=\"nav-link w-nav-link\">Login</a>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form action=\"MainController\" method=\"POST\">\n");
      out.write("            <input type=\"text\" name=\"search\" placeholder=\"What do you want to search?\" value=\"");
      out.print( search);
      out.write("\"/>\n");
      out.write("            <input type=\"submit\"  class=\"button w-button\" name=\"adaction\" value=\"Search\"/></br> \n");
      out.write("            <div class=\"radio-inputs\">\n");
      out.write("                <label>\n");
      out.write("                    <input class=\"radio-input\" type=\"radio\" name=\"cata\" value=\"Piano\">\n");
      out.write("                    <span class=\"radio-tile\">\n");
      out.write("                        <span class=\"radio-icon\">\n");
      out.write("                            <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\" width=\"200px\" height=\"200px\"><path d=\"M19 6h-2v10h1v2H6v-2h1V6H5c-1.103 0-2 .897-2 2v10h2v2h14v-2h2V8c0-1.103-.897-2-2-2zM8 6h1v10H8V6zm2 0h1v10h-1V6zm2 0h1v10h-1V6zm2 0h1v10h-1V6z\"/></svg> </span>\n");
      out.write("                        <span class=\"radio-label\">Piano</span>\n");
      out.write("                    </span>\n");
      out.write("                </label>\n");
      out.write("                <label>\n");
      out.write("                    <input class=\"radio-input\" type=\"radio\" name=\"cata\" value=\"Guitar\">\n");
      out.write("                    <span class=\"radio-tile\">\n");
      out.write("                        <span class=\"radio-icon\">\n");
      out.write("                            <svg fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 512 512\" width=\"200px\" height=\"200px\"><path d=\"M426.666 0c-23.522 0-42.666 19.144-42.666 42.666 0 10.292 3.791 19.707 9.865 27.031l-93.86 93.859c-10.193 10.193-13.593 26.151-9.635 40.686l-64.843 64.843c-11.041-2.802-22.708-4.125-34.635-4.125-22.646 0-45.083 6.818-64.448 20.083L6.615 366.302C2.443 369.443 0 374.693 0 380.198V480c0 17.646 14.354 32 32 32h99.802c5.505 0 10.755-2.443 13.896-6.615l84.429-120.192c23.583-23.583 32.708-55.281 26.009-86.776l64.843-64.843c14.536 3.958 30.494.558 40.686-9.635l93.86-93.86c7.323 6.073 16.739 9.865 27.031 9.865 23.522 0 42.666-19.144 42.666-42.666S450.187 0 426.666 0zm-13.365 51.365c-3.849-3.849-3.849-10.108 0-13.957 3.849-3.849 10.108-3.849 13.957 0 3.849 3.849 3.849 10.108 0 13.957-3.85 3.849-10.108 3.849-13.957 0zM85.875 473.765H48.235v-37.64L171.615 312.75c9.729-9.729 22.26-16.487 35.776-19.448l11.089 40.167-16.823 16.823c-4.375 4.374-4.374 11.458 0 15.832s11.458 4.374 15.832 0l16.823-16.823 40.167 11.089c-2.961 13.516-9.718 26.047-19.448 35.776L85.875 473.765z\"></path></svg>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"radio-label\">Guitar</span>\n");
      out.write("                    </span>\n");
      out.write("                </label>\n");
      out.write("                <label>\n");
      out.write("                    <input class=\"radio-input\" type=\"radio\" name=\"cata\" value=\"Drawing\">\n");
      out.write("                    <span class=\"radio-tile\">\n");
      out.write("                        <span class=\"radio-icon\">\n");
      out.write("                            <!-- Pen SVG Icon -->\n");
      out.write("                            <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\" width=\"200px\" height=\"200px\"><path d=\"M19.41 2.59a2.002 2.002 0 0 0-2.828 0l-3 3L5 16.172V19h2.828l8.586-8.586 3-3a2.002 2.002 0 0 0 0-2.828l-2-2zM5 20v2h14v-2H5z\"/></svg>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"radio-label\">Drawing</span>\n");
      out.write("                    </span>\n");
      out.write("                </label>\n");
      out.write("            </div>\n");
      out.write("        </form>    \n");
      out.write("\n");
      out.write("        <div class=\"content-section-bg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"title-wrap-centre\">\n");
      out.write("                    <h2>Create course</h2>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div\n");
      out.write("                    data-duration-in=\"300\"\n");
      out.write("                    data-duration-out=\"100\"\n");
      out.write("                    data-current=\"Burgers\"\n");
      out.write("                    data-easing=\"ease\"\n");
      out.write("                    class=\"w-tabs\"\n");
      out.write("                    >\n");
      out.write("                    <form action=\"MainController\">\n");
      out.write("                        <div\n");
      out.write("                            role=\"listitem\"\n");
      out.write("                            class=\"menu-item w-dyn-item w-col \"\n");
      out.write("                            >\n");
      out.write("                            <div class=\"food-card\">\n");
      out.write("                                <div>\n");
      out.write("                                    <div class=\"file btn btn-lg btn-primary\">\n");
      out.write("                                        Change Photo\n");
      out.write("                                        <input type=\"file\" name=\"images\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"food-card-content\">\n");
      out.write("                                    <p class=\"food-title-wrap w-inline-block\">\n");
      out.write("                                    <h6>Course name: <input type=\"text\" name=\"coursename\" required=\"\" placeholder=\"Input course name\"/></h6>\n");
      out.write("                                    <div\n");
      out.write("                                        data-wf-sku-bindings=\"%5B%7B%22from%22%3A%22f_price_%22%2C%22to%22%3A%22innerHTML%22%7D%5D\"\n");
      out.write("                                        class=\"price\"\n");
      out.write("                                        >\n");
      out.write("                                        Price:<input type=\"text\" name=\"price\" required=\"\"/>\n");
      out.write("                                    </div></p\n");
      out.write("                                    >\n");
      out.write("                                    <p class=\"paragraph\">\n");
      out.write("\n");
      out.write("                                        Description: <input type=\"text\" name=\"description\" required=\"\" placeholder=\"Input description\"/>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p class=\"paragraph\">\n");
      out.write("\n");
      out.write("                                        Start date:  <input type=\"date\" name=\"startdate\" required=\"\"/>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p class=\"paragraph\">\n");
      out.write("\n");
      out.write("                                        End date:   <input type=\"date\" name=\"enddate\" required=\"\"/>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p class=\"paragraph\">\n");
      out.write("                                        Category id: <select name=\"categoryid\" required=\"\"></br>\n");
      out.write("                                            <option value=\"1\">Piano</option>\n");
      out.write("                                            <option value=\"2\">Guitar</option>\n");
      out.write("                                            <option value=\"3\">Drawing</option>\n");
      out.write("                                        </select></br>\n");
      out.write("                                    </p>\n");
      out.write("\n");
      out.write("                                    <div class=\"add-to-cart\">\n");
      out.write("                                        <form\n");
      out.write("                                            data-node-type=\"commerce-add-to-cart-form\"\n");
      out.write("                                            data-commerce-sku-id=\"5e865e09d8efa3905776b635\"\n");
      out.write("                                            data-loading-text=\"Adding to cart...\"\n");
      out.write("                                            data-commerce-product-id=\"5e865e09d8efa32ba376b634\"\n");
      out.write("                                            class=\"w-commerce-commerceaddtocartform default-state\"\n");
      out.write("                                            >\n");
      out.write("                                            Quantity: <input type=\"text\" name=\"quantity\" required=\"\"/>\n");
      out.write("                                            </br>\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"submit\"\n");
      out.write("                                                class=\"w-commerce-commerceaddtocartbutton order-button\"\n");
      out.write("                                                name=\"adaction\" value=\"Create course\"\n");
      out.write("                                                />\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content-section-bg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"title-wrap-centre\">\n");
      out.write("                    <h2>Our course</h2>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div\n");
      out.write("                    data-duration-in=\"300\"\n");
      out.write("                    data-duration-out=\"100\"\n");
      out.write("                    data-current=\"Burgers\"\n");
      out.write("                    data-easing=\"ease\"\n");
      out.write("                    class=\"w-tabs\"\n");
      out.write("                    >\n");
      out.write("\n");
      out.write("                    ");

                        
                        CourseDAO dao = new CourseDAO();
                        List<Course> listCsr = dao.getFullCourseAd();
                        List<Course> list = (List<Course>) request.getAttribute("LIST_COURSE_AD");
                        if(list!= null){
                            listCsr = list;
                        }
                        if (listCsr != null) {
                            if (listCsr.size() > 0) {
                    
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                        for (Course csr : listCsr) {
                    
      out.write("\n");
      out.write("                    <form action=\"MainController\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div\n");
      out.write("                            role=\"listitem\"\n");
      out.write("                            class=\"menu-item w-dyn-item w-col \"\n");
      out.write("                            >\n");
      out.write("                            <div class=\"food-card\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p class=\"food-image-square w-inline-block\">\n");
      out.write("                                        <img alt=\"\"\n");
      out.write("                                             data-wf-sku-bindings=\"%5B%7B%22from%22%3A%22f_main_image_4dr%22%2C%22to%22%3A%22src%22%7D%5D\"\n");
      out.write("                                             src=\"");
      out.print( csr.getImages());
      out.write("\"\n");
      out.write("                                             class=\"food-image\"\n");
      out.write("                                             />\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"file btn btn-lg btn-primary\">\n");
      out.write("                                        Change Photo\n");
      out.write("                                        <input type=\"file\" name=\"images\" value=\"");
      out.print( csr.getImages());
      out.write("\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"food-card-content\">\n");
      out.write("                                    <p class=\"food-title-wrap w-inline-block\">\n");
      out.write("                                    <h6>ID:<input type=\"text\" class=\"input-id\" name=\"id\" value=\"");
      out.print( csr.getId());
      out.write("\" /></h6>\n");
      out.write("                                    <h6>Course name: <input type=\"text\" name=\"coursename\" value=\"");
      out.print( csr.getCoursename());
      out.write("\"/></h6>\n");
      out.write("                                    <div\n");
      out.write("                                        data-wf-sku-bindings=\"%5B%7B%22from%22%3A%22f_price_%22%2C%22to%22%3A%22innerHTML%22%7D%5D\"\n");
      out.write("                                        class=\"price\"\n");
      out.write("                                        >\n");
      out.write("                                        Price:<input type=\"text\" name=\"price\" value=\"");
      out.print( csr.getPrice());
      out.write("\"/>\n");
      out.write("                                    </div></p\n");
      out.write("                                    >\n");
      out.write("                                    <p class=\"paragraph\">\n");
      out.write("\n");
      out.write("                                        Description: <input type=\"text\" name=\"description\" value=\"");
      out.print( csr.getDescription());
      out.write("\"/>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p class=\"paragraph\">\n");
      out.write("\n");
      out.write("                                        Start date:  <input type=\"date\" name=\"startdate\" required=\"\" value=\"");
      out.print( csr.getStartdate());
      out.write("\"/>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p class=\"paragraph\">\n");
      out.write("\n");
      out.write("                                        End date:   <input type=\"date\" name=\"enddate\" required=\"\" value=\"");
      out.print( csr.getEnddate());
      out.write("\"/>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p class=\"paragraph\">\n");
      out.write("\n");
      out.write("                                        Category id: <select name=\"categoryid\" required=\"\"></br>\n");
      out.write("                                            ");

                                                int idcata = csr.getCategoryid();
                                                if (idcata == 1) {
                                            
      out.write("\n");
      out.write("                                            <option value=\"1\" >Piano</option>\n");
      out.write("                                            <option value=\"2\">Guitar</option>\n");
      out.write("                                            <option value=\"3\">Drawing</option>\n");
      out.write("                                            ");

                                            } else if (idcata == 2) {
                                            
      out.write("\n");
      out.write("                                            <option value=\"2\">Guitar</option>\n");
      out.write("                                            <option value=\"1\" >Piano</option>\n");
      out.write("                                            <option value=\"3\">Drawing</option>\n");
      out.write("                                            ");

                                            } else if (idcata == 3) {
                                            
      out.write("\n");
      out.write("                                            <option value=\"3\">Drawing</option>\n");
      out.write("                                            <option value=\"2\">Guitar</option>\n");
      out.write("                                            <option value=\"1\" >Piano</option>\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                        </select></br>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p class=\"paragraph\">\n");
      out.write("                                        ");

                                            if (csr.isStatus()) {
                                        
      out.write("\n");
      out.write("                                    <td>\n");
      out.write("                                        Status: <input type=\"checkbox\" name=\"status\" checked=\"checked\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                    ");
 } else {
                                    
      out.write("\n");
      out.write("                                    <td>\n");
      out.write("                                        Status: <input type=\"checkbox\" name=\"status\" />\n");
      out.write("                                    </td>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"add-to-cart\">\n");
      out.write("                                        <form\n");
      out.write("                                            data-node-type=\"commerce-add-to-cart-form\"\n");
      out.write("                                            data-commerce-sku-id=\"5e865e09d8efa3905776b635\"\n");
      out.write("                                            data-loading-text=\"Adding to cart...\"\n");
      out.write("                                            data-commerce-product-id=\"5e865e09d8efa32ba376b634\"\n");
      out.write("                                            class=\"w-commerce-commerceaddtocartform default-state\"\n");
      out.write("                                            >\n");
      out.write("                                            Quantity: <input\n");
      out.write("                                                type=\"number\"                                           \n");
      out.write("                                                min=\"1\"\n");
      out.write("                                                name=\"quantity\" value=\"");
      out.print( csr.getQuantity());
      out.write("\"\n");
      out.write("                                                /><input\n");
      out.write("                                                type=\"submit\"\n");
      out.write("                                                class=\"w-commerce-commerceaddtocartbutton order-button\"\n");
      out.write("                                                name=\"adaction\" value=\"Delete Course\"\n");
      out.write("                                                />\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"submit\"\n");
      out.write("                                                class=\"w-commerce-commerceaddtocartbutton order-button\"\n");
      out.write("                                                name=\"adaction\" value=\"Course Update\"\n");
      out.write("                                                />\n");
      out.write("\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    ");

                            }
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

            }

        
      out.write("\n");
      out.write("          <div class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"w-layout-grid footer-grid\">\n");
      out.write("                    <div\n");
      out.write("                        id=\"w-node-_67f7db32-28d2-9f37-8b84-a159dcc6da5a-dcc6da57\"\n");
      out.write("                        class=\"footer-column\"\n");
      out.write("                        >\n");
      out.write("                        <img src=\"View/Img/logo.svg\" width=\"80\" alt=\"\" class=\"footer-logo\" />\n");
      out.write("                        <p>\n");
      out.write("                            TTK * Piano music center, <br />Sound - Light and Music Education.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-column\">\n");
      out.write("                        <a\n");
      out.write("                            href=\"home_ad.jsp\"\n");
      out.write("                            aria-current=\"page\"\n");
      out.write("                            class=\"footer-link w--current\"\n");
      out.write("                            >Home</a\n");
      out.write("                        >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-column\">\n");
      out.write("                        <a\n");
      out.write("                            href=\"search-csr-result.jsp\"\n");
      out.write("                            aria-current=\"page\"\n");
      out.write("                            class=\"footer-link w--current\"\n");
      out.write("                            >Order</a\n");
      out.write("                        >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-column\">\n");
      out.write("                        <a href=\"contact.jsp\" class=\"footer-link\">Contact</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
        String error = (String) request.getAttribute("MESSAGE");
            if (error == null) {
                error = "";
            }
        
      out.write("\n");
      out.write("        ");
      out.print( error);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
