/**
 *
 * Written by: Zaw Win Oo
 * Contact Info: zawoo@cisco.com
 * Last Updated: September 6, 2009
 *
 */

/*Check for a special character'***/
function isSpecialCharacter() {
   var iChars = "!@#$%^&*()+=-[]\\\';,./{}|\":<>?";
   for (var i = 0; i < document.qfrm.q.value.length; i++) {
      if (iChars.indexOf(document.qfrm.q.value.charAt(i)) != -1) {
         alert ("The box has special characters. \nThese are not allowed.\n");
         return false;
      }
   }
}

function confirmAdminDelete(adminID) {
   var r=confirm("Are you sure you want to DELETE the following admin ID: "+adminID+"?");
   if (r==true) {
      alert("Admin ID "+adminID+" has been deleted from the database.")
      window.location = "deleteOneAdmin.php?act=trackdelete&adminID="+adminID;
   } else{
      alert("No action taken")
   }
}


function confirmPaymentCodeDelete(paymentCodeID) {
   var r=confirm("Are you sure you want to DELETE the following payment code ID: "+paymentCodeID+"?");
   if (r==true) {
      alert("Payment Code ID "+paymentCodeID+" has been deleted from the database.")
      window.location = "deleteOnePaymentCode.php?act=trackdelete&paymentCodeID="+paymentCodeID;
   } else{
      alert("No action taken")
   }
}


function confirmExamInfoDelete(examID) {
   var r=confirm("Are you sure you want to DELETE the following exam ID: "+examID+"?");
   if (r==true) {
      alert("Exam ID "+examID+" has been deleted from the database.")
      window.location = "deleteOneExamInfo.php?act=trackdelete&examID="+examID;
   } else{
      alert("No action taken")
   }
}


function confirmContactInfoDelete(contactID) {
   var r=confirm("Are you sure you want to DELETE the following contact ID: "+contactID+"?");
   if (r==true) {
      alert("Contact ID "+contactID+" has been deleted from the database.")
      window.location = "deleteOneContactInfo.php?act=trackdelete&contactID="+contactID;
   } else{
      alert("No action taken")
   }
}


function confirmCEPInfoDelete(cepID) {
   var r=confirm("Are you sure you want to DELETE the following CEP ID: "+cepID+"? This is the in-reversible process, once deleted CEP info won't be able retrieve back from the database again. Please confirm!!!");
   if (r==true) {
      alert("CEP ID "+cepID+" has been deleted from the database.")
      window.location = "deleteOneCEPInfo.php?act=trackdelete&contactID="+cepID;
   } else{
      alert("No action taken")
   }
}


function confirmRegistrationInfoDelete(registrationID) {
   var r=confirm("Are you sure you want to DELETE the following registration ID: "+registrationID+"?");
   if (r==true) {
      alert("Registration ID "+registrationID+" has been deleted from the database.")
      window.location = "deleteOneRegistrationInfo.php?act=trackdelete&registrationID="+registrationID;
   } else{
      alert("No action taken")
   }
}


function confirmCEApplicationInfoDelete(applicationID) {
   var r=confirm("Are you sure you want to DELETE the following application ID: "+applicationID+"?");
   if (r==true) {
      alert("Application ID "+applicationID+" has been deleted from the database.")
      window.location = "deleteOneCEApplicationInfo.php?act=trackdelete&applicationID="+applicationID;
   } else{
      alert("No action taken")
   }
}


function confirmCEActivityInfoDelete(activityID) {
   var r=confirm("Are you sure you want to DELETE the following activity ID: "+activityID+"?");
   if (r==true) {
      alert("Activity ID "+activityID+" has been deleted from the database.")
      window.location = "deleteOneCEActivityInfo.php?act=trackdelete&activityID="+activityID;
   } else{
      alert("No action taken")
   }
}


function openNewWorkInfo(contactID) {
   window.location = "addNewWorkInfo.php?contactID="+contactID;
   //document.location = "addNewWorkInfo.php?contactID="+contactID;
}


function openPopUpWindow(url) {
   window.open(url,
      'popup',
      'width=600,height=700,scrollbars=yes,resizable=yes,toolbar=no,directories=no,location=no,menubar=no,status=yes,left=50,top=0');
}

function sendAlert(message) {
   alert("Error: "+message+"")
}


function checkDate(d,m,y) {
   var yl=1900; // least year to consider
   var ym=2080; // most year to consider
   if (m<1 || m>12) return(false);
   if (d<1 || d>31) return(false);
   if (y<yl || y>ym) return(false);
   if (m==4 || m==6 || m==9 || m==11) { // taking care of months of 30 days
      if (d==31) return(false);
   }
   if (m==2) { // take care of leap year
      var b=parseInt(y/4);
      if (isNaN(b)) return(false);
      if (d>29) return(false);
      if (d==29 && ((y/4)!=parseInt(y/4))) return(false);
   }
   return(true);
}


function showEmptyCells() {
   document.getElementById('myTable').style.emptyCells="show"
}


function CreateExcelSheet(tableName) {

   var x=tableName.rows

   var xls = new ActiveXObject("Excel.Application")
   xls.visible = true
   xls.Workbooks.Add
   for (i = 0; i < x.length; i++) {
      var y = x[i].cells

      for (j = 0; j < y.length; j++) {
         xls.Cells( i+1, j+1).Value = y[j].innerText
      }
   }
}


var datePickerDivID = "datepicker";
var iFrameDivID = "datepickeriframe";
 
var dayArrayShort = new Array('Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa');
var dayArrayMed = new Array('Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat');
var dayArrayLong = new Array('Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday');
var monthArrayShort = new Array('Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec');
var monthArrayMed = new Array('Jan', 'Feb', 'Mar', 'Apr', 'May', 'June', 'July', 'Aug', 'Sept', 'Oct', 'Nov', 'Dec');
var monthArrayLong = new Array('January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December');
 
// these variables define the date formatting we're expecting and outputting.
// If you want to use a different format by default, change the
// defaultDateSeparator and defaultDateFormat variables either here or on
// your HTML page.
var defaultDateSeparator = "/";        // common values would be "/" or "."
var defaultDateFormat = "mdy"    // valid values are "mdy", "dmy", and "ymd"
var dateSeparator = defaultDateSeparator;
var dateFormat = defaultDateFormat;
 
function displayDatePicker(dateFieldName, displayBelowThisObject, dtFormat, dtSep)
{

   var targetDateField = document.getElementsByName (dateFieldName).item(0);
 
   // if we weren't told what node to display the datepicker beneath, just display it
   // beneath the date field we're updating
   if (!displayBelowThisObject)
      displayBelowThisObject = targetDateField;
 
   // if a date separator character was given, update the dateSeparator variable
   if (dtSep)
     dateSeparator = dtSep;
   else
     dateSeparator = defaultDateSeparator;
 
   // if a date format was given, update the dateFormat variable
   if (dtFormat)
     dateFormat = dtFormat;
   else
     dateFormat = defaultDateFormat;
 
   var x = displayBelowThisObject.offsetLeft;
   var y = displayBelowThisObject.offsetTop + displayBelowThisObject.offsetHeight ;
 
   // deal with elements inside tables and such
   var parent = displayBelowThisObject;
   while (parent.offsetParent) {
     parent = parent.offsetParent;
     x += parent.offsetLeft;
     y += parent.offsetTop ;
   }
 
   drawDatePicker(targetDateField, x, y);
}
 
 
/**
Draw the datepicker object (which is just a table with calendar elements) at the
specified x and y coordinates, using the targetDateField object as the input tag
that will ultimately be populated with a date.
 
This function will normally be called by the displayDatePicker function.
*/
function drawDatePicker(targetDateField, x, y)
{
  var dt = getFieldDate(targetDateField.value );
 
  // the datepicker table will be drawn inside of a <div> with an ID defined by the
  // global datePickerDivID variable. If such a div doesn't yet exist on the HTML
  // document we're working with, add one.
  if (!document.getElementById(datePickerDivID)) {
    // don't use innerHTML to update the body, because it can cause global variables
    // that are currently pointing to objects on the page to have bad references
    //document.body.innerHTML += "<div id='" + datePickerDivID + "' class='dpDiv'></div>";
    var newNode = document.createElement("div");
    newNode.setAttribute("id", datePickerDivID);
    newNode.setAttribute("class", "dpDiv");
    newNode.setAttribute("style", "visibility: hidden;");
    document.body.appendChild(newNode);
  }
 
  // move the datepicker div to the proper x,y coordinate and toggle the visiblity
  var pickerDiv = document.getElementById(datePickerDivID);
  pickerDiv.style.position = "absolute";
  pickerDiv.style.left = x + "px";
  pickerDiv.style.top = y + "px";
  pickerDiv.style.visibility = (pickerDiv.style.visibility == "visible" ? "hidden" : "visible");
  pickerDiv.style.display = (pickerDiv.style.display == "block" ? "none" : "block");
  pickerDiv.style.zIndex = 10000;
 
  // draw the datepicker table
  refreshDatePicker(targetDateField.name, dt.getFullYear(), dt.getMonth(), dt.getDate());
}
 
 
/**
This is the function that actually draws the datepicker calendar.
*/
function refreshDatePicker(dateFieldName, year, month, day)
{
  // if no arguments are passed, use today's date; otherwise, month and year
  // are required (if a day is passed, it will be highlighted later)
  var thisDay = new Date();
 
  if ((month >= 0) && (year > 0)) {
    thisDay = new Date(year, month, 1);
  } else {
    day = thisDay.getDate();
    thisDay.setDate(1);
  }
 
  // the calendar will be drawn as a table
  // you can customize the table elements with a global CSS style sheet,
  // or by hardcoding style and formatting elements below
  var crlf = "\r\n";
  var TABLE = "<table cols=7 class='dpTable'>" + crlf;
  var xTABLE = "</table>" + crlf;
  var TR = "<tr class='dpTR'>";
  var TR_title = "<tr class='dpTitleTR'>";
  var TR_days = "<tr class='dpDayTR'>";
  var TR_todaybutton = "<tr class='dpTodayButtonTR'>";
  var xTR = "</tr>" + crlf;
  var TD = "<td class='dpTD' onMouseOut='this.className=\"dpTD\";' onMouseOver=' this.className=\"dpTDHover\";' ";    // leave this tag open, because we'll be adding an onClick event
  var TD_title = "<td colspan=5 class='dpTitleTD'>";
  var TD_buttons = "<td class='dpButtonTD'>";
  var TD_todaybutton = "<td colspan=7 class='dpTodayButtonTD'>";
  var TD_days = "<td class='dpDayTD'>";
  var TD_selected = "<td class='dpDayHighlightTD' onMouseOut='this.className=\"dpDayHighlightTD\";' onMouseOver='this.className=\"dpTDHover\";' ";    // leave this tag open, because we'll be adding an onClick event
  var xTD = "</td>" + crlf;
  var DIV_title = "<div class='dpTitleText'>";
  var DIV_selected = "<div class='dpDayHighlight'>";
  var xDIV = "</div>";
 
  // start generating the code for the calendar table
  var html = TABLE;
 
  // this is the title bar, which displays the month and the buttons to
  // go back to a previous month or forward to the next month
  html += TR_title;
  html += TD_buttons + getButtonCode(dateFieldName, thisDay, -1, "&lt;") + xTD;
  html += TD_title + DIV_title + monthArrayLong[ thisDay.getMonth()] + " " + thisDay.getFullYear() + xDIV + xTD;
  html += TD_buttons + getButtonCode(dateFieldName, thisDay, 1, "&gt;") + xTD;
  html += xTR;
 
  // this is the row that indicates which day of the week we're on
  html += TR_days;
  for(i = 0; i < dayArrayShort.length; i++)
    html += TD_days + dayArrayShort[i] + xTD;
  html += xTR;
 
  // now we'll start populating the table with days of the month
  html += TR;
 
  // first, the leading blanks
  for (i = 0; i < thisDay.getDay(); i++)
    html += TD + "&nbsp;" + xTD;
 
  // now, the days of the month
  do {
    dayNum = thisDay.getDate();
    TD_onclick = " onclick=\"updateDateField('" + dateFieldName + "', '" + getDateString(thisDay) + "');\">";
    
    if (dayNum == day)
      html += TD_selected + TD_onclick + DIV_selected + dayNum + xDIV + xTD;
    else
      html += TD + TD_onclick + dayNum + xTD;
    
    // if this is a Saturday, start a new row
    if (thisDay.getDay() == 6)
      html += xTR + TR;
    
    // increment the day
    thisDay.setDate(thisDay.getDate() + 1);
  } while (thisDay.getDate() > 1)
 
  // fill in any trailing blanks
  if (thisDay.getDay() > 0) {
    for (i = 6; i > thisDay.getDay(); i--)
      html += TD + "&nbsp;" + xTD;
  }
  html += xTR;
 
  // add a button to allow the user to easily return to today, or close the calendar
  var today = new Date();
  var todayString = "Today is " + dayArrayMed[today.getDay()] + ", " + monthArrayMed[ today.getMonth()] + " " + today.getDate();
  html += TR_todaybutton + TD_todaybutton;
  html += "<button class='dpTodayButton' onClick='refreshDatePicker(\"" + dateFieldName + "\");'>this month</button> ";
  html += "<button class='dpTodayButton' onClick='updateDateField(\"" + dateFieldName + "\");'>close</button>";
  html += xTD + xTR;
 
  // and finally, close the table
  html += xTABLE;
 
  document.getElementById(datePickerDivID).innerHTML = html;
  // add an "iFrame shim" to allow the datepicker to display above selection lists
  adjustiFrame();
}
 
 
/**
Convenience function for writing the code for the buttons that bring us back or forward
a month.
*/
function getButtonCode(dateFieldName, dateVal, adjust, label)
{
  var newMonth = (dateVal.getMonth () + adjust) % 12;
  var newYear = dateVal.getFullYear() + parseInt((dateVal.getMonth() + adjust) / 12);
  if (newMonth < 0) {
    newMonth += 12;
    newYear += -1;
  }
 
  return "<button class='dpButton' onClick='refreshDatePicker(\"" + dateFieldName + "\", " + newYear + ", " + newMonth + ");'>" + label + "</button>";
}
 
 
/**
Convert a JavaScript Date object to a string, based on the dateFormat and dateSeparator
variables at the beginning of this script library.
*/
function getDateString(dateVal)
{
  var dayString = "00" + dateVal.getDate();
  var monthString = "00" + (dateVal.getMonth()+1);
  dayString = dayString.substring(dayString.length - 2);
  monthString = monthString.substring(monthString.length - 2);
 
  switch (dateFormat) {
    case "dmy" :
      return dayString + dateSeparator + monthString + dateSeparator + dateVal.getFullYear();
    case "ymd" :
      return dateVal.getFullYear() + dateSeparator + monthString + dateSeparator + dayString;
    case "mdy" :
    default :
      return monthString + dateSeparator + dayString + dateSeparator + dateVal.getFullYear();
  }
}
 
 
/**
Convert a string to a JavaScript Date object.
*/
function getFieldDate(dateString)
{
  var dateVal;
  var dArray;
  var d, m, y;
 
  try {
    dArray = splitDateString(dateString);
    if (dArray) {
      switch (dateFormat) {
        case "dmy" :
          d = parseInt(dArray[0], 10);
          m = parseInt(dArray[1], 10) - 1;
          y = parseInt(dArray[2], 10);
          break;
        case "ymd" :
          d = parseInt(dArray[2], 10);
          m = parseInt(dArray[1], 10) - 1;
          y = parseInt(dArray[0], 10);
          break;
        case "mdy" :
        default :
          d = parseInt(dArray[1], 10);
          m = parseInt(dArray[0], 10) - 1;
          y = parseInt(dArray[2], 10);
          break;
      }
      dateVal = new Date(y, m, d);
    } else if (dateString) {
      dateVal = new Date(dateString);
    } else {
      dateVal = new Date();
    }
  } catch(e) {
    dateVal = new Date();
  }
 
  return dateVal;
}
 
 
/**
Try to split a date string into an array of elements, using common date separators.
If the date is split, an array is returned; otherwise, we just return false.
*/
function splitDateString(dateString)
{
  var dArray;
  if (dateString.indexOf("/") >= 0)
    dArray = dateString.split("/");
  else if (dateString.indexOf(".") >= 0)
    dArray = dateString.split(".");
  else if (dateString.indexOf("-") >= 0)
    dArray = dateString.split("-");
  else if (dateString.indexOf("\\") >= 0)
    dArray = dateString.split("\\");
  else
    dArray = false;
 
  return dArray;
}
 
/**
Update the field with the given dateFieldName with the dateString that has been passed,
and hide the datepicker. If no dateString is passed, just close the datepicker without
changing the field value.
 
Also, if the page developer has defined a function called datePickerClosed anywhere on
the page or in an imported library, we will attempt to run that function with the updated
field as a parameter. This can be used for such things as date validation, setting default
values for related fields, etc. For example, you might have a function like this to validate
a start date field:
 
function datePickerClosed(dateField)
{
  var dateObj = getFieldDate(dateField.value);
  var today = new Date();
  today = new Date(today.getFullYear(), today.getMonth(), today.getDate());
 
  if (dateField.name == "StartDate") {
    if (dateObj < today) {
      // if the date is before today, alert the user and display the datepicker again
      alert("Please enter a date that is today or later");
      dateField.value = "";
      document.getElementById(datePickerDivID).style.visibility = "visible";
      adjustiFrame();
    } else {
      // if the date is okay, set the EndDate field to 7 days after the StartDate
      dateObj.setTime(dateObj.getTime() + (7 * 24 * 60 * 60 * 1000));
      var endDateField = document.getElementsByName ("EndDate").item(0);
      endDateField.value = getDateString(dateObj);
    }
  }
}
 
*/
function updateDateField(dateFieldName, dateString)
{
  var targetDateField = document.getElementsByName (dateFieldName).item(0);
  if (dateString)
    targetDateField.value = dateString;
 
  var pickerDiv = document.getElementById(datePickerDivID);
  pickerDiv.style.visibility = "hidden";
  pickerDiv.style.display = "none";
 
  adjustiFrame();
  targetDateField.focus();
 
  // after the datepicker has closed, optionally run a user-defined function called
  // datePickerClosed, passing the field that was just updated as a parameter
  // (note that this will only run if the user actually selected a date from the datepicker)
  if ((dateString) && (typeof(datePickerClosed) == "function"))
    datePickerClosed(targetDateField);
}
 
 
/**
Use an "iFrame shim" to deal with problems where the datepicker shows up behind
selection list elements, if they're below the datepicker. The problem and solution are
described at:
 
http://dotnetjunkies.com/WebLog/jking/archive/2003/07/21/488.aspx
http://dotnetjunkies.com/WebLog/jking/archive/2003/10/30/2975.aspx
*/
function adjustiFrame(pickerDiv, iFrameDiv)
{
  // we know that Opera doesn't like something about this, so if we
  // think we're using Opera, don't even try
  var is_opera = (navigator.userAgent.toLowerCase().indexOf("opera") != -1);
  if (is_opera)
    return;
  
  // put a try/catch block around the whole thing, just in case
  try {
    if (!document.getElementById(iFrameDivID)) {
      // don't use innerHTML to update the body, because it can cause global variables
      // that are currently pointing to objects on the page to have bad references
      //document.body.innerHTML += "<iframe id='" + iFrameDivID + "' src='javascript:false;' scrolling='no' frameborder='0'>";
      var newNode = document.createElement("iFrame");
      newNode.setAttribute("id", iFrameDivID);
      newNode.setAttribute("src", "javascript:false;");
      newNode.setAttribute("scrolling", "no");
      newNode.setAttribute ("frameborder", "0");
      document.body.appendChild(newNode);
    }
    
    if (!pickerDiv)
      pickerDiv = document.getElementById(datePickerDivID);
    if (!iFrameDiv)
      iFrameDiv = document.getElementById(iFrameDivID);
    
    try {
      iFrameDiv.style.position = "absolute";
      iFrameDiv.style.width = pickerDiv.offsetWidth;
      iFrameDiv.style.height = pickerDiv.offsetHeight ;
      iFrameDiv.style.top = pickerDiv.style.top;
      iFrameDiv.style.left = pickerDiv.style.left;
      iFrameDiv.style.zIndex = pickerDiv.style.zIndex - 1;
      iFrameDiv.style.visibility = pickerDiv.style.visibility ;
      iFrameDiv.style.display = pickerDiv.style.display;
    } catch(e) {
    }
 
  } catch (ee) {
  }
 
}

//form validation for submitting CE App
function checkAgreement(form) {
	if(form.agreement.checked == false){
		alert("Please agree to the Code of Ethics");
		return false;	
	}
	
	return true;
}