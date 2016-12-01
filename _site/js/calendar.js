// check out the docs for fullcalendar at https://fullcalendar.io/
// console.table(events);
$('#calendar').fullCalendar({
  header: {
    left: 'prev,next today',
    center: 'title',
    right: 'month,basicWeek,basicDay'
  },
  defaultDate: '2016-12-12',
  editable: false,
  eventLimit: true, // allow "more" link when too many events
  contentHeight: 650,
  events: events, // events var declared in events.html
  eventClick: function(event) {
    if (event.url) {
      window.open(event.url);
      return false;
    }
  },
  eventRender: function(event, element) {
    element.qtip({
      content: event.description,
      position: {
        my: 'top center',
        at: 'bottom center'
      },
      style: {
        name: 'dark',
        classes: 'qtip-dark qtip-shadow',
        color: 'white'
      }
    });
  }
});
