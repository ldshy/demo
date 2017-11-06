<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HTML5 canvas圆形气泡动画背景插件|DEMO_jQuery之家-自由分享jQuery、html5、css3的插件库</title>
    <link rel="stylesheet" type="text/css" href="../dest/css/normalize.css" />
    <link rel="stylesheet" href="../dest/css/style.css">
</head>
<body>
<div class="wrapper">
    <header class="header">
        <div class="full-center">
            <div style="width:300px;height:400px;">
                <div  style="height:80%;margin-top:10%;background:rgba(163, 167, 220, 0.51)"></div>
            </div>
        </div>
        <!--
        <div class="arrow__btn">
            <a href="#main" class="btn">
                <img src="dest/img/download.svg" alt="" width="50" height="50">
            </a>
        </div>
        -->
    </header>
</div>
<script src="http://cdn.bootcss.com/jquery/1.11.0/jquery.min.js" type="text/javascript"></script>
<script>window.jQuery || document.write('<script src="../js/jquery-1.11.0.min.js"><\/script>')</script>
<script src="../dest/main.js"></script>
<script src="../dest/circleMagic.min.js"></script>
<script>
    $('.header').circleMagic({
        elem: '.header',
        radius: 35,
        densety: .3,
        color: 'rgba(255,255,255, .4)',
        //color: 'random',
        clearOffset: .3
    });
</script>
</body>
</html>