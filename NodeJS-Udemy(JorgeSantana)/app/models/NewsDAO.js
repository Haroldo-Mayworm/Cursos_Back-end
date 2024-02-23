function NewsDAO(connection) {
    this._connection = connection;
}

NewsDAO.prototype.getNews = function (callback) {
    this._connection.query('select * from news_list order by date_create desc', callback);
};

NewsDAO.prototype.getNewsDetails = function (id_news, callback) {
    this._connection.query('select * from news_list where id = ' + id_news.id, callback);
};

NewsDAO.prototype.saveNews = function (news, callback) {
    this._connection.query('insert into news_list set ? ', news, callback);
};

NewsDAO.prototype.getLastFiveNews = function (callback) {
    this._connection.query('select * from news_list order by date_create desc limit 5', callback);
};

module.exports = function () {
    return NewsDAO;
};
