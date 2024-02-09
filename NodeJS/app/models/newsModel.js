module.exports = function () {
    this.getNews = function (connection, callback) {
        connection.query('select * from news_list', callback);
    };

    this.getNews = function (connection, callback) {
        
    }

    return this;
};
