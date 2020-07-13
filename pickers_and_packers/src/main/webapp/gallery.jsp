

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   
    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Gallery : SafeX Packers and Movers</title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="img/wpf-favicon.png"/>

    <!-- CSS
    ================================================== -->       
    <!-- Bootstrap css file-->
    <link href="bootstrap.min.css" rel="stylesheet">
    <!-- Font awesome css file-->
    <link href="font-awesome.min.css" rel="stylesheet">
    <!-- Superslide css file-->
    <link rel="stylesheet" href="superslides.css">
    <!-- Slick slider css file -->
    <link href="slick.css" rel="stylesheet"> 
    <!-- Circle counter cdn css file -->
    <link rel='stylesheet prefetch' href='https://cdn.rawgit.com/pguso/jquery-plugin-circliful/master/css/jquery.circliful.css'>  
    <!-- smooth animate css file -->
    <link rel="stylesheet" href="animate.css"> 
    <!-- preloader -->
    <link rel="stylesheet" href="queryLoader.css" type="text/css" />
    <!-- gallery slider css -->
    <link type="text/css" media="all" rel="stylesheet" href="jquery.tosrus.all.css" />    
    <!-- Default Theme css file -->
    <link id="switcher" href="themes/default-theme.css" rel="stylesheet">
    <!-- Main structure css file -->
    <link href="style.css" rel="stylesheet">
   
    <!-- Google fonts -->
    <link href='http://fonts.googleapis.com/css?family=Merriweather' rel='stylesheet' type='text/css'>   
    <link href='http://fonts.googleapis.com/css?family=Varela' rel='stylesheet' type='text/css'>    

    
  </head>
  <body>

    <!-- SCROLL TOP BUTTON -->
    <a class="scrollToTop" href="#"></a>
    <!-- END SCROLL TOP BUTTON -->

    <!--=========== BEGIN HEADER SECTION ================-->
   <jsp:include page="./header.html" flush="true">
     <jsp:param name="pageTitle" value="newInstance.com"/>
     <jsp:param name="pageSlogan" value=" " />
</jsp:include>
   <!--=========== END HEADER SECTION ================--> 

    <!--=========== BEGIN COURSE BANNER SECTION ================-->
    <section id="imgBanner">
      <h2>Gallery</h2>
    </section>
    <!--=========== END COURSE BANNER SECTION ================-->
    
    <!--=========== BEGIN GALLERY SECTION ================-->
    <section id="gallery">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 col-md-12 col-sm-12">
            <div id="gallerySLide" class="gallery_area">
                <a href="img/img-large1.jpg" title="This is Title">
                  <img class="gallery_img" src="img/img-large1.jpg" alt="img" />
                <span class="view_btn">View</span>
                </a>
                <a href="img/img-large2.jpg" title="This is Title2">
                  <img class="gallery_img" src="img/img-large2.jpg" alt="img" />
                  <span class="view_btn">View</span>
                </a>
                <a href="img/img-large3.jpg" title="This is Title3">
                  <img class="gallery_img" src="img/img-large3.jpg" alt="img" />
                  <span class="view_btn">View</span>
                </a>
                <a href="img/img-large4.jpg" title="This is Title4">
                  <img class="gallery_img" src="img/img-large4.jpg" alt="img" />
                  <span class="view_btn">View</span>
                </a>
                <a href="img/img-large5.jpg" title="This is Title5">
                  <img class="gallery_img" src="img/img-large5.jpg" alt="img" />
                  <span class="view_btn">View</span>
                </a>
                
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=========== END GALLERY SECTION ================-->
    
    <!--=========== BEGIN FOOTER SECTION ================-->
  <jsp:include page="./footer.html" flush="true">
     <jsp:param name="pageBottom" value="newInstance.com"/>
     <jsp:param name="pageSlogan" value=" " />
</jsp:include>
   <!--=========== END FOOTER SECTION ================--> 

  

    <!-- Javascript Files
    ================================================== -->

    <!-- initialize jQuery Library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Preloader js file -->
    <script src="queryloader2.min.js" type="text/javascript"></script>
    <!-- For smooth animatin  -->
    <script src="wow.min.js"></script>  
    <!-- Bootstrap js -->
    <script src="bootstrap.min.js"></script>
    <!-- slick slider -->
    <script src="slick.min.js"></script>
    <!-- superslides slider -->
    <script src="jquery.easing.1.3.js"></script>
    <script src="jquery.animate-enhanced.min.js"></script>
    <script src="jquery.superslides.min.js" type="text/javascript" charset="utf-8"></script>   
    <!-- for circle counter -->
    <script src='https://cdn.rawgit.com/pguso/jquery-plugin-circliful/master/js/jquery.circliful.min.js'></script>
    <!-- Gallery slider -->
    <script type="text/javascript" language="javascript" src="jquery.tosrus.min.all.js"></script>   
   
    <!-- Custom js-->
    <script src="js/custom.js"></script>
  

  </body>
</html>
