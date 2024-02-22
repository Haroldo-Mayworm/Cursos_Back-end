var mysql = require('mysql');

var connMysql = function () {
    return mysql.createConnection({
        host: 'localhost',
        user: 'root',
        password: '13579246',
        database: 'news_portal',
    });
}

module.exports = function () {
    return connMysql;
};
