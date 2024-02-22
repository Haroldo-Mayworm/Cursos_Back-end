module.exports.form = function (app, req, res) {
    res.render('admin/form_add_news');
};

module.exports.news_save = function (app, req, res) {
    var news = req.body;
    var connection = app.config.DBConnection();
    var newsModel = new app.app.models.NewsDAO(connection);

    newsModel.saveNews(news, function (error, result) {
        if (error) {
            console.error('Error executing query:', error);
            res.status(500).send('Internal Server Error');
            return;
        }
        res.redirect('/news');
    });
};
