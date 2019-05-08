package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Blocked_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!-- \n");
      out.write("Template Name: Brunette - Responsive Bootstrap 4 Admin Dashboard Template\n");
      out.write("Author: Hencework\n");
      out.write("Contact: https://hencework.ticksy.com/\n");
      out.write("\n");
      out.write("License: You must have a valid license purchased only from templatemonster to legally use the template for your project.\n");
      out.write("-->\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("    <title>UniFirst | Blocked</title>\n");
      out.write("    <meta name=\"description\" content=\"A responsive bootstrap 4 admin dashboard template by hencework\" />\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("    <link rel=\"icon\" href=\"dist/img/graduation.ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"dist/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- Preloader -->\n");
      out.write("    <div class=\"preloader-it\">\n");
      out.write("        <div class=\"loader-pendulums\"></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /Preloader -->\n");
      out.write("    \n");
      out.write("\t<!-- HK Wrapper -->\n");
      out.write("\t<div class=\"hk-wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Main Content -->\n");
      out.write("        <div class=\"hk-pg-wrapper hk-auth-wrapper\">\n");
      out.write("            <header class=\"d-flex justify-content-end align-items-center\">\n");
      out.write("                <div class=\"btn-group btn-group-sm\">\n");
      out.write("                    <a href=\"#\" class=\"btn btn-outline-secondary\">Help</a>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-outline-secondary\">About Us</a>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xl-12 pa-0\">\n");
      out.write("                        <div class=\"auth-form-wrap pt-xl-0 pt-70\">\n");
      out.write("                            <div class=\"auth-form w-xl-25 w-lg-30 w-sm-50 w-100\">\n");
      out.write("                                <a class=\"auth-brand text-center d-block mb-45\" href=\"#\">\n");
      out.write("                                    <img class=\"brand-img\" src=\"dist/img/logo-light.png\" alt=\"brand\" />\n");
      out.write("                                </a>\n");
      out.write("                                <form>\n");
      out.write("                                    <div class=\"d-62 bg-white rounded-circle mb-10 d-flex align-items-center justify-content-center mx-auto\">\n");
      out.write("                                        <i class=\"zmdi zmdi-settings font-28\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h1 class=\"display-4 mb-10 text-center\">Sorry we are down for maintenance</h1>\n");
      out.write("                                    <p class=\"mb-30 text-center\">We apologize for the inconvenience, we are doing our best to get things back in order for you. Please feel free to <a href=\"#\"><u>contact us</u></a> for any queries.</p>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /Main Content -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /HK Wrapper -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"vendors/popper.js/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Slimscroll JavaScript -->\n");
      out.write("    <script src=\"dist/js/jquery.slimscroll.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Fancy Dropdown JS -->\n");
      out.write("    <script src=\"dist/js/dropdown-bootstrap-extended.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- FeatherIcons JavaScript -->\n");
      out.write("    <script src=\"dist/js/feather.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Init JavaScript -->\n");
      out.write("    <script src=\"dist/js/init.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
