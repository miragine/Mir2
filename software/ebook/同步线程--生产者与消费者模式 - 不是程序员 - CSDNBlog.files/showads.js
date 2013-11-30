var a=window;
if (ad_type==null)
{
	var ad_type='c';
}
if (ad_color==null)
{
	var ad_color='';
}
if (ad_color_border==null)
{
	var ad_color_border='';
}
if (tags==null)
{
	var tags='';
}
if (count==null)
{
	var count=3;
}
var tagstr='';
var str='';
function gettag(source, name)
{
  var reg = new RegExp("(^|\\?|&)"+ name +"=([^&]*)(\\s|&|$)", "i"); 
  if (reg.test(source)) return RegExp.$2; return "";
};
if (tags!='')
{
	tagstr=tags;
}
else 
{
	tagstr=gettag(a.location,'Tags');
}
if(tagstr=='')
{
if (document.charset=='utf-8')
{
str='http://tagegg.csdn.net/a.aspx?action=displayad&unionuser='+unionuser+'&unionurl='+encodeURIComponent(a.location)+'&adcss='+adcss+'&ad_type='+ad_type+'&width='+ad_width+'&height='+ad_height+'&ad_color='+ad_color+'&ad_color_border='+ad_color_border+'&count='+count;
}
else
{
str='http://tagegg.csdn.net/b.aspx?action=displayad&unionuser='+unionuser+'&unionurl='+encodeURIComponent(a.location)+'&adcss='+adcss+'&ad_type='+ad_type+'&width='+ad_width+'&height='+ad_height+'&ad_color='+ad_color+'&ad_color_border='+ad_color_border+'&count='+count;
}
}
else
{
if (document.charset=='utf-8')
{
str='http://tagegg.csdn.net/a.aspx?action=displayad&unionuser='+unionuser+'&unionurl='+encodeURIComponent(a.location)+'&adcss='+adcss+'&ad_type='+ad_type+'&width='+ad_width+'&height='+ad_height+'&ad_color='+ad_color+'&ad_color_border='+ad_color_border+'&Tags='+encodeURIComponent(tagstr)+'&count='+count;
}
else
{
str='http://tagegg.csdn.net/b.aspx?action=displayad&unionuser='+unionuser+'&unionurl='+encodeURIComponent(a.location)+'&adcss='+adcss+'&ad_type='+ad_type+'&width='+ad_width+'&height='+ad_height+'&ad_color='+ad_color+'&ad_color_border='+ad_color_border+'&Tags='+encodeURIComponent(tagstr)+'&count='+count;
}
}
//window.open(str);
document.write('<script language="JavaScript1.1" src='+str+"><\/script>");