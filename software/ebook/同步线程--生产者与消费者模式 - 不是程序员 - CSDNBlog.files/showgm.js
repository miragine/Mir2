// JScript File
if(typeof(gms) != 'undefined') 
	{
	var outhtml='<div class="postTitle">特别推荐：</div><ul class="postText">';
	for (var k in gms)
	 {
		if(typeof(gms[k].title)=='undefined') continue;
		outhtml+='<li><a href="'+gms[k].link+'" target="_blank">'+gms[k].title+'</a>';
		outhtml+='<br />'+gms[k].desc1+'  '+gms[k].desc2+'  ';
		outhtml+=' <a href="http://tag.csdn.net/tag/'+gms[k].tag+'" target="_blank">'+gms[k].tag+'</a></li>';
    }
	outhtml+='</ul></div>';
	document.getElementById("csdn_zhaig_ad_yahoo").innerHTML=outhtml;
 }


