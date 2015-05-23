<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xml:lang="en" xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
<meta name="Description" id="Description" content="f">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="style/template-base-level-2.css" rel="stylesheet" media="screen">
<link rel="stylesheet" type="text/style" href="style/template-subjectnav.css">
<link rel="stylesheet" type="text/style" href="user.css">
<link REL=StyleSheet HREF="formatStyles.css" TYPE="text/style" MEDIA=screen,print>
<script language="JavaScript" src="gen_validatorv31.js" type="text/javascript"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>

if($.browser.msie && $.browser.version=="6.0") {

alert("You appear to be using Internet Explorer 6. MyCEP is not guaranteed to work on IE6 and may result in blank pages. Please upgrade to IE7+ or Mozilla Firefox. There are links at the bottom of the page");
}
</script>
</head>

<body lang="en">
<div id="masthead">
  <!--<a href="http://www.scu.edu/"><img src="images/scu-cep-logo.png" id="logo" /></a>-->
<a href="http://www.scu.edu/"><img src="images/logo_for_webtest.gif" id="logo" ></a></div>
<div class="topmargin"></div>

<div align='center'>
<!-- Maintenance code goes from here
<div style="width:750px; margin:auto;">
<table>
<tr>
<td><h3>The MyCEP system is currently undergoing general maintenance in order to provide you the best experience possible. Sorry for any inconveniences this may have caused. Please check back later. </h3></td>
<td><img src="maintenance.jpg"/></td>
</tr>
</table>
</div>
 to here -->

<div align='center'>


<table  class="indexpagetable">

<tr><td><h3 class="h3"> CEPI Information Management System </h3></td></tr>
<tr><td><table class="indexpagetable">
<tr><td><h3 class="subheader">Existing users login below</h3></td></tr>
</table></td></tr>
<tr><td>
<table  class="indexpagetable">
<form name='myform' action="/user/login" method="post">
<tr><td width="25%" >Email Address:</td><td > <input type="text" name="email" /></td></tr>
<tr><td>Password:</td><td ><input type="password" name="password" />

<tr><td></td>
<td>
<input align="right" type="Submit" value= "Login"/>
</td></tr>
</table>
</td></tr>
</form>
<tr><td>
<div class="topmargin" ></div>
<table class="indexpagetable">
<tr><td><h3 class="subheader">If you are a new user or have forgotten your password use the links below:</h3></td></tr>
<tr><td><a href="check.html">Register as new user</a></td></tr>
<tr><td><a href="forgotPasswordCandidate.php">Forgot Password (Password Reset)</a></td></tr>
<!-- <tr><td><h3 class="subheader"><font color=red><b>All passwords for the MyCEP system have been reset as of August 16, 2012.  If you have not accessed the system since August 16, please click the "Forgot Password (Password Reset)" link below.  A new password will be sent to your email address.  NOTE: You cannot "copy and paste" the password from the email message to log in.  You must type the password.  It is case sensitive.  If you have any problems accessing your account, please contact the CEPI at (408) 554-2187 or cepi@scu.edu.</b></font></h3></td></tr>-->
</table>
</td></tr>
</table>

<div id="page-index" align="center">
<p class="bodytext">This site is best viewed with Microsoft Internet Explorer 7.0+ or Firefox 3.0+.  Please visit the links below to download and install the latest version of your browser.</p>

<a href="http://www.microsoft.com/windows/internet-explorer/default.aspx">Microsoft Internet Explorer</a><br>&nbsp;<br>
<a href="http://www.mozilla.com/en-US/firefox/ie.html">Firefox</a>
</div> 

<SCRIPT language="JavaScript" type="text/javascript">
	 var frmvalidator  = new Validator("myform");

	 frmvalidator.addValidation("email","req","Please enter your email!");
	 frmvalidator.addValidation("email","email","Please enter a valid email!");
	 frmvalidator.addValidation("password","req","Please enter your password!");

</script>






</body>
</html>
