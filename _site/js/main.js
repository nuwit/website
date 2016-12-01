$(function() {
  // for landing page arrow
  $('a.scroll-down').bind('click', function(event) {
    var $anchor = $(this);
    $('html, body').stop().animate({
      scrollTop: $($anchor.attr('href')).offset().top - 65
    }, 1000, 'easeInOutQuad');
    event.preventDefault();
  });

  $('.gallery-item').magnificPopup({
    type: 'image',
    gallery: { enabled: true }
  });

  // prevents map from zooming in when scrolling down the contact page
  let $map = $('#map');
  let $mapOverlay = $('#map-overlay');
  $map.addClass('scrolloff');
  $map.mouseleave(function() {
    $('#map').addClass('scrolloff');
  });
  $mapOverlay.on("mouseup", function() {
    $('#map').addClass('scrolloff');
  });
  $mapOverlay.on("mousedown", function() {
    $('#map').removeClass('scrolloff');
  });
});
