package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>UniFirst | Login</title>\n");
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
      out.write("   \n");
      out.write("\t<!-- HK Wrapper -->\n");
      out.write("\t<div class=\"hk-wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Main Content -->\n");
      out.write("        <div class=\"hk-pg-wrapper hk-auth-wrapper\">\n");
      out.write("            <header class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                <a class=\"d-flex auth-brand\" href=\"#\">\n");
      out.write("                    <img class=\"brand-img\" src=\"dist/img/logonew.png\" alt=\"brand\" />\n");
      out.write("                </a>\n");
      out.write("                <div class=\"btn-group btn-group-sm\">\n");
      out.write("                    <a href=\"#\" class=\"btn btn-outline-secondary\">Help</a>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-outline-secondary\">About Us</a>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xl-5 pa-0\">\n");
      out.write("                        <div id=\"owl_demo_1\" class=\"owl-carousel dots-on-item owl-theme\">\n");
      out.write("                            <div class=\"fadeOut item auth-cover-img overlay-wrap\" style=\"background-image:url(dist/img/uni.jpg);\">\n");
      out.write("                                <div class=\"auth-cover-info py-xl-0 pt-100 pb-50\">\n");
      out.write("                                    <div class=\"auth-cover-content text-center w-xxl-75 w-sm-90 w-xs-100\">\n");
      out.write("                                        <h1 class=\"display-3 text-white mb-20\">Understand and look deep into nature.</h1>\n");
      out.write("                                        <p class=\"text-white\">The purpose of lorem ipsum is to create a natural looking block of text (sentence, paragraph, page, etc.) that doesn't distract from the layout. Again during the 90s as desktop publishers bundled the text with their software.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"bg-overlay bg-trans-dark-50\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"fadeOut item auth-cover-img overlay-wrap\" style=\"background-image:url(dist/img/com.jpg);\">\n");
      out.write("                                <div class=\"auth-cover-info py-xl-0 pt-100 pb-50\">\n");
      out.write("                                    <div class=\"auth-cover-content text-center w-xxl-75 w-sm-90 w-xs-100\">\n");
      out.write("                                        <h1 class=\"display-3 text-white mb-20\">Experience matters for good applications.</h1>\n");
      out.write("                                        <p class=\"text-white\">The passage experienced a surge in popularity during the 1960s when Letraset used it on their dry-transfer sheets, and again during the 90s as desktop publishers bundled the text with their software.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bg-overlay bg-trans-dark-50\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-7 pa-0\">\n");
      out.write("                        <div class=\"auth-form-wrap py-xl-0 py-50\">\n");
      out.write("                            <div class=\"auth-form w-xxl-55 w-xl-75 w-sm-90 w-xs-100\">\n");
      out.write("                                <form action=\"LoginServelet\" method=\"post\">\n");
      out.write("                                    <h1 class=\"display-4 mb-10\">Welcome Back :)</h1>\n");
      out.write("                                    <p class=\"mb-30\">Sign in to your account and enjoy unlimited perks.</p>\n");
      out.write("                                    <p class=\"mb-5 text-danger\">");
if(null!=request.getAttribute("errorMessage"))
                                                                    {
                                                                        out.println(request.getAttribute("errorMessage"));
                                                                    }
                                                                
      out.write("</p>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input class=\"form-control\" placeholder=\"Email\" type=\"email\" name=\"txtEmail\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"Password\" type=\"password\" name=\"txtPassword\" required>\n");
      out.write("<!--                                            <div class=\"input-group-append\">\n");
      out.write("                                                <span class=\"input-group-text\"><span class=\"feather-icon\"><i data-feather=\"eye-off\"></i></span></span>\n");
      out.write("                                            </div>-->\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"custom-control custom-checkbox mb-25\">\n");
      out.write("                                        <input class=\"custom-control-input\" id=\"same-address\" type=\"checkbox\" checked>\n");
      out.write("                                        <label class=\"custom-control-label font-14\" for=\"same-address\">Keep me logged in</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button class=\"btn btn-primary btn-block\" type=\"submit\">Login</button>\n");
      out.write("                                    <p class=\"font-14 text-center mt-15\">Having trouble logging in?</p>\n");
      out.write("                                    <div class=\"option-sep\">or</div>\n");
      out.write("<!--                                    <div class=\"form-row\">\n");
      out.write("                                        <div class=\"col-sm-6 mb-20\">\n");
      out.write("                                            <button class=\"btn btn-indigo btn-block btn-wth-icon\"> <span class=\"icon-label\"><i class=\"fa fa-facebook\"></i> </span><span class=\"btn-text\">Login with facebook</span></button>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6 mb-20\">\n");
      out.write("                                            <button class=\"btn btn-sky btn-block btn-wth-icon\"> <span class=\"icon-label\"><i class=\"fa fa-twitter\"></i> </span><span class=\"btn-text\">Login with Twitter</span></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>-->\n");
      out.write("                                    <p class=\"text-center\">Do have an account yet? <a href=\"Signup.jsp\">Sign Up</a></p>\n");
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
      out.write("\t<!-- /HK Wrapper -->\n");
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
      out.write("    <!-- Owl JavaScript -->\n");
      out.write("    <script src=\"vendors/owl.carousel/dist/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- FeatherIcons JavaScript -->\n");
      out.write("    <script src=\"dist/js/feather.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Init JavaScript -->\n");
      out.write("    <script src=\"dist/js/init.js\"></script>\n");
      out.write("    <script src=\"dist/js/login-data.js\"></script>\n");
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
