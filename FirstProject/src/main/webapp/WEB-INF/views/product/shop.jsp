<%@include file="../include/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
        <div class="shop_sidebar_area">

            <!-- ##### Single Widget ##### -->
            <div class="widget catagory mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Catagories</h6>

                <!--  Catagories  -->
                <div class="catagories-menu">
                    <ul>
                        <li class="active"><a href="#">Chairs</a></li>
                        <li><a href="#">Beds</a></li>
                        <li><a href="#">Accesories</a></li>
                        <li><a href="#">Furniture</a></li>
                        <li><a href="#">Home Deco</a></li>
                        <li><a href="#">Dressings</a></li>
                        <li><a href="#">Tables</a></li>
                    </ul>
                </div>
            </div>

            <!-- ##### Single Widget ##### -->
            <div class="widget price mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Price</h6>

                <div class="widget-desc">
                    <div class="slider-range">
                        <div data-min="10" data-max="1000" data-unit="$" 
                        class="slider-range-price ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all" 
                        data-value-min="10" data-value-max="1000" data-label-result="">
                            <div class="ui-slider-range ui-widget-header ui-corner-all"></div>
                            <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0"></span>
                            <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0"></span>
                        </div>
                        <div class="range-price">$10 - $1000</div>
                    </div>
                </div>
            </div>
        </div>

        <div class="amado_product_area section-padding-100">
            <div class="container-fluid">

                <div class="row">
                    <div class="col-12">
                        <div class="product-topbar d-xl-flex align-items-end justify-content-between">
                        
                            <!-- Total Products -->
                            <div class="total-products">
                                <p>Showing 1-8 0f 25</p>
                                <div class="view d-flex">
                                    <a href="#"><i class="fa fa-th-large" aria-hidden="true"></i></a>
                                    <a href="#"><i class="fa fa-bars" aria-hidden="true"></i></a>
                                </div>
                            </div>
                            
                            <!-- Sorting -->
                            <div class="product-sorting d-flex">
                            
                                <div class="sort-by-date d-flex align-items-center mr-15">
                                    <p>Sort by</p>
                                    <form action="#" method="get">
                                        <select name="select" id="sortBydate">
                                            <option value="value">Date</option>
                                            <option value="value">Newest</option>
                                            <option value="value">Popular</option>
                                        </select>
                                    </form>
                                </div>
                                
                                <div class="view-product d-flex align-items-center">
                                    <p>View</p>
                                    <form action="#" method="get">
                                        <select name="select" id="viewProduct">
                                            <option value="value">12</option>
                                            <option value="value">24</option>
                                            <option value="value">48</option>
                                            <option value="value">96</option>
                                        </select>
                                    </form>
                                </div>
                                
                            </div>
                            
                        </div>
                    </div>
                </div>
				
				
                <div class="row">

                    <!-- Single Product Area -->
<<<<<<< HEAD
                <c:forEach items="${list}" var="list">
=======
                <c:forEach items="${list}" var="vo">
>>>>>>> refs/remotes/origin/Feature/GyuDeok
                    <div class="col-12 col-sm-6 col-md-12 col-xl-6">
                        <div class="single-product-wrapper">
                            <!-- Product Image -->
                            <div class="product-img">
                                <img src="${pageContext.request.contextPath}/resources/img/product-img/product1.jpg" alt="">
                                <!-- Hover Thumb -->
                                <img class="hover-img" src="${pageContext.request.contextPath}/resources/img/product-img/product2.jpg" alt="">
                            </div>

                            <!-- Product Description -->
                            <div class="product-description d-flex align-items-center justify-content-between">
                                <!-- Product Meta Data -->
                                <div class="product-meta-data">
                                    <div class="line"></div>
<<<<<<< HEAD
                                    <p class="product-price">${list.prodPrice }원</p>
=======
                                    <p class="product-price">₩<fmt:formatNumber value="${vo.prodPrice }" pattern="###,###,###"/></p>
>>>>>>> refs/remotes/origin/Feature/GyuDeok
                                    <a href="product-details.html">
<<<<<<< HEAD
                                        <h6>${list.prodName }</h6>
=======
                                        <h6>${vo.prodName }</h6>
>>>>>>> refs/remotes/origin/Feature/GyuDeok
                                    </a>
                                </div>
                                <!-- Ratings & Cart -->
                                <div class="ratings-cart text-right">
                                    
                                    <div class="cart">
                                        <a href="cart.html" data-toggle="tooltip" data-placement="left" title="Add to Cart">
                                        <img src="${pageContext.request.contextPath}/resources/img/core-img/cart.png" alt=""></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
				</c:forEach>
				
                <div class="row">
                    <div class="col-12">
                        <!-- Pagination -->
                        <nav aria-label="navigation">
                            <ul class="pagination justify-content-end mt-50">
                                <li class="page-item active"><a class="page-link" href="#">1</a></li>
                                <li class="page-item"><a class="page-link" href="#">2</a></li>
                                <li class="page-item"><a class="page-link" href="#">3</a></li>
                                <li class="page-item"><a class="page-link" href="#">4</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
                
            </div>
        </div>
    </div>
    <!-- ##### Main Content Wrapper End ##### -->

<%@include file="../include/footer.jsp" %>