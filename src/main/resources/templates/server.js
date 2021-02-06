/**
let http = require('http')
let fs = require ('fs')
let url = require('url')

let server = http.createServer()
server.on('request', (request, response)=>{
response.writeHead(200)
let query = url.parse(request.url, true).query
let name = query.name === undefined? "anomyme" :query.name
fs.readFile('home.html','utf8',(err, data) =>{
if(err){
response.writeHead(400)
response.end("questo file non esiste")
}else{
response.writeHead(200, {
'content-type': 'home/html;charset-utf-8'
})
data = data.replace('{{name}}' ,name)
response.end(data)
}

})

})
server.listen(9090)

*/





var http = require('http');
var url = require('url');
var querystring = require('querystring');

var server = http.createServer(function(req, res) {
  var params = querystring.parse(url.parse(req.url).query);
  res.writeHead(200, {"Content-Type": "home/html;charset-utf-8"});
  if ('firstname' in params && 'lastname' in params) {
    res.write('Il tuo nome: ' + params['firstname'] + ' ' + params['lastname']);
  } else {
    res.write('Tu hai un nome giusto?');
  }
  res.end();
});

server.listen(8081);



