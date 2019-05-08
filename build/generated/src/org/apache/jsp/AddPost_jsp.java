package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddPost_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Unifirst | Add Members</title>\n");
      out.write("    <meta name=\"description\" content=\"A responsive bootstrap 4 admin dashboard template by hencework\" />\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("    <link rel=\"icon\" href=\"dist/img/graduation.ico\" type=\"image/x-icon\">\n");
      out.write("\t\n");
      out.write("\t<!-- Morris Charts CSS -->\n");
      out.write("    <link href=\"vendors/morris.js/morris.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\n");
      out.write("    <!-- Toggles CSS -->\n");
      out.write("    <link href=\"vendors/jquery-toggles/css/toggles.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"vendors/jquery-toggles/css/themes/toggles-light.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t\n");
      out.write("\t<!-- Toastr CSS -->\n");
      out.write("    <link href=\"vendors/jquery-toast-plugin/dist/jquery.toast.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    \n");
      out.write("    \t<!-- Bootstrap Dropzone CSS -->\n");
      out.write("\t<link href=\"vendors/dropify/dist/css/dropify.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"dist/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- Preloader -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Main Content -->\n");
      out.write("        <div class=\"hk-pg-wrapper\">\n");
      out.write("\t\t\t<!-- Container -->\n");
      out.write("            <div class=\"container mt-xl-50 mt-sm-30 mt-15\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <section class=\"hk-sec-wrapper\">\n");
      out.write("                            <h5 class=\"hk-sec-title\">Add Post</h5>\n");
      out.write("                            <br>\n");
      out.write("                            \n");
      out.write("                            <!--<p class=\"mb-25\">Add Student Accounts in Here use University Email Address</p>-->\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm\">\n");
      out.write("                                    <form>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label mb-10\" for=\"exampleInputuname_1\">Title</label>\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                \n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"exampleInputuname_1\" name=\"username\" placeholder=\"Title\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group mb-0\">\n");
      out.write("                                            <label class=\"control-label mb-10\" for=\"exampleInputuname_1\">Image Upload</label>\n");
      out.write("                                            <input type=\"file\" id=\"input-file-now\" class=\"dropify\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <br>\n");
      out.write("                                        <div class=\"form-group mb-0\">\n");
      out.write("                                            <label class=\"control-label mb-10\" for=\"exampleInputuname_1\">Post Body</label>\n");
      out.write("                                            <textarea class=\"tinymce\"></textarea>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        <br>\n");
      out.write("                                        \n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary mr-10\">Submit</button>\n");
      out.write("                                        <button type=\"reset\" class=\"btn btn-light\">Reset</button>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </section>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <!-- /Container -->\n");
      out.write("\t\t\t\n");
      out.write("            <!-- Footer -->\n");
      out.write("            \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("<!--            <div class=\"hk-footer-wrap container\">\n");
      out.write("                <footer class=\"footer\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                            <p>Pampered by<a href=\"https://hencework.com/\" class=\"text-dark\" target=\"_blank\">Hencework</a> © 2019</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                            <p class=\"d-inline-block\">Follow us</p>\n");
      out.write("                            <a href=\"#\" class=\"d-inline-block btn btn-icon btn-icon-only btn-indigo btn-icon-style-4\"><span class=\"btn-icon-wrap\"><i class=\"fa fa-facebook\"></i></span></a>\n");
      out.write("                            <a href=\"#\" class=\"d-inline-block btn btn-icon btn-icon-only btn-indigo btn-icon-style-4\"><span class=\"btn-icon-wrap\"><i class=\"fa fa-twitter\"></i></span></a>\n");
      out.write("                            <a href=\"#\" class=\"d-inline-block btn btn-icon btn-icon-only btn-indigo btn-icon-style-4\"><span class=\"btn-icon-wrap\"><i class=\"fa fa-google-plus\"></i></span></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("            </div>-->\n");
      out.write("            <!-- /Footer -->\n");
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
      out.write("    <!-- Toggles JavaScript -->\n");
      out.write("    <script src=\"vendors/jquery-toggles/toggles.min.js\"></script>\n");
      out.write("    <script src=\"dist/js/toggle-data.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Toastr JS -->\n");
      out.write("    <!--<script src=\"vendors/jquery-toast-plugin/dist/jquery.toast.min.js\"></script>-->\n");
      out.write("    \n");
      out.write("\t<!-- Counter Animation JavaScript -->\n");
      out.write("\t<script src=\"vendors/waypoints/lib/jquery.waypoints.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/jquery.counterup/jquery.counterup.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Morris Charts JavaScript -->\n");
      out.write("    <script src=\"vendors/raphael/raphael.min.js\"></script>\n");
      out.write("    <script src=\"vendors/morris.js/morris.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Easy pie chart JS -->\n");
      out.write("    <script src=\"vendors/easy-pie-chart/dist/jquery.easypiechart.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Flot Charts JavaScript -->\n");
      out.write("    <script src=\"vendors/flot/excanvas.min.js\"></script>\n");
      out.write("    <script src=\"vendors/flot/jquery.flot.js\"></script>\n");
      out.write("    <script src=\"vendors/flot/jquery.flot.pie.js\"></script>\n");
      out.write("    <script src=\"vendors/flot/jquery.flot.resize.js\"></script>\n");
      out.write("    <script src=\"vendors/flot/jquery.flot.time.js\"></script>\n");
      out.write("    <script src=\"vendors/flot/jquery.flot.stack.js\"></script>\n");
      out.write("    <script src=\"vendors/flot/jquery.flot.crosshair.js\"></script>\n");
      out.write("    <script src=\"vendors/jquery.flot.tooltip/js/jquery.flot.tooltip.min.js\"></script>\n");
      out.write("    \n");
      out.write("    \t<!-- Dropify JavaScript -->\n");
      out.write("\t<script src=\"vendors/dropify/dist/js/dropify.min.js\"></script>\n");
      out.write("\t\n");
      out.write("        <!-- EChartJS JavaScript -->\n");
      out.write("    <script src=\"vendors/echarts/dist/echarts-en.min.js\"></script>\n");
      out.write("    \n");
      out.write("        <!-- Init JavaScript -->\n");
      out.write("    <script src=\"dist/js/init.js\"></script>\n");
      out.write("    <script src=\"dist/js/dashboard2-data.js\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\t<!-- Dropzone JavaScript -->\n");
      out.write("\t<script src=\"vendors/dropzone/dist/dropzone.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Dropify JavaScript -->\n");
      out.write("\t<script src=\"vendors/dropify/dist/js/dropify.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Form Flie Upload Data JavaScript -->\n");
      out.write("\t<script src=\"dist/js/form-file-upload-data.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- FeatherIcons JavaScript -->\n");
      out.write("\t<script src=\"dist/js/feather.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Toggles JavaScript -->\n");
      out.write("\t<script src=\"vendors/jquery-toggles/toggles.min.js\"></script>\n");
      out.write("\t<script src=\"dist/js/toggle-data.js\"></script>\n");
      out.write("        \n");
      out.write("          <!-- Tinymce JavaScript -->\n");
      out.write("    <script src=\"vendors/tinymce/tinymce.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Tinymce Wysuhtml5 Init JavaScript -->\n");
      out.write("    <script src=\"dist/js/tinymce-data.js\"></script>\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("\n");
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
