var http = require('http');

var server = http.createServer(function (req, res) {
  var category = req.url;

  if (category == 'tech') {
    res.end('<html><body>Technology Portal</body></html>');
  }
  res.end('<html><body>News Portal</body></html>');
});

server.listen(3000);
