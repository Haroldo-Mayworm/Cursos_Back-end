module.exports = function () {
    this.getNews = function (connection, callback) {
        connection.query('select * from news_list', callback);
    };

    this.getNewsDetails = function (connection, callback) {
        connection.query('select * from news_list where id = 1', callback);
    };

    this.saveNews = function (news, connection, callback) {
        connection.query('insert into news_list set ? ', news, callback)
    }

    return this;
};
