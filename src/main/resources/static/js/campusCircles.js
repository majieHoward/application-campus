﻿var list = document.getElementById("list");
var lazyLoadApi = mui('#pullrefresh .mui-scroll').imageLazyload({
    autoDestroy: false,
    placeholder: 'images/placeholderImage.png'
});
mui.init({
    pullRefresh: {
        container: '#pullrefresh',
        down: {
            callback: function() {
                setTimeout(function() {
                    var elements = createFragment(5);
                    list.insertBefore(elements, list.firstElementChild);
                    lazyLoadApi.refresh(true);
                    mui('#pullrefresh').pullRefresh().endPulldownToRefresh(); //refresh completed
                }, 2000);
            }
        },
        up: {
            auto: true,
            callback: function() {
                setTimeout(function() {
                    var elements = createFragment(5);
                    list.appendChild(elements);
                    lazyLoadApi.refresh(true);
                    mui('#pullrefresh').pullRefresh().endPullupToRefresh(); //refresh completed
                }, 2000);
            }
        }
    }
});
var createFragment = function(count) {
    var fragment = document.createDocumentFragment();
    var li;
    for (var i = 0; i < count; i++) {
        li = document.createElement('li');
        li.className = 'mui-card';
        li.innerHTML =''
        +'<div class="mui-card-header mui-card-media">'
        +'<img src="http://wx.qlogo.cn/mmopen/RKeLNKp2313cLN64s6wykw53icHyZE0rnp3oJewticgVMCKGwlhvelYXHY2kibfAOmyj7aBMEKxnuiaX0NOK7TKibicWFFcKohPrfQ/0" />'
        +'<div class="mui-media-body">'
        +'overcast'
        +'<span class="mui-icons-self icon-self-weizhi">成都市</span>'
        +'<p>22 小时前(10:35) · 晴 4 &#8451; · 15千米</p>' 
        +'</div>'
        +'</div>'
        +'<div class="mui-card-content" >'
        +'<img width="100%" data-lazyload="http://127.0.0.1:8080/images/' + (i % 5 + 1) + '.jpg?version=' + Math.random() * 1000 + '">'
        +'<div class="mui-card-content-inner">'
        +'<p style="color: #333;">'
        +'<a href="buttons.html">这里显示文章摘要，让读者对文章内容有个粗略的概念...'
        +'</a>' 
        +'</p>' 
        +'</div>' 
        +'</div>' 
        +'<div class="mui-card-footer">' 
        +'<a><span class="mui-icon-extra mui-icon-extra-like"></span></a>'
        +'<a ><span class="mui-icon mui-icon-chatbubble"></span></a>' 
        +'<a ><span class="mui-icon-extra mui-icon-extra-share"></span></a>' 
        +'</div>';
        fragment.appendChild(li);
    }
    return fragment;
};

mui("#list").on('tap', 'a', function (event) {
    window.parent.openDetailPager("/detailPage.html");
});
/**回到顶部**/
//mui('.mui-scroll-wrapper').pullRefresh().refresh(true);
//mui('.mui-scroll-wrapper').pullRefresh().scrollTo(0, 0, 1000);//滚动到顶部
//window.scrollTo(0, 0);
/**获取页面滚动距离**/
var scroll = mui('.mui-scroll-wrapper').scroll();
document.querySelector('.mui-scroll-wrapper').addEventListener('scroll',function (e) {
    /**TODO**/
    console.log(scroll.y);
});
var subPageProcessing=function(){

};