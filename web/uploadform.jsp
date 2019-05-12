<%-- 
    Document   : uploadform
    Created on : May 11, 2019, 10:48:40 AM
    Author     : DUL
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Image Upload</title>
    </head>
    <body>
           <form action="FileUploadServelet" method="post" enctype="multipart/form-data">
    <table width="400px" align="center" border=0>
       <tr>
           <td align="center" colspan=2>
            Image Details</td>
       </tr>
       <tr>
           <td>First Name </td>
           <td>
               <input type="text" name="firstname">
           </td>
       </tr>
       <tr>
           <td>Last Name </td>
           <td>
               <input type="text" name="lastname">
           </td>
       </tr>
       <tr>
           <td>Image Link: </td>
           <td>
               <input type="file" name="file">
           </td>
       </tr>
       <tr>
           <td></td>
           <td>
              <input type="submit" name="submit" value="Submit"></td>
       </tr>
   </table>
</form>
    </body>
</html>
