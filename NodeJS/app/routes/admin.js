module.exports = function (app) {
    app.get('/form', function (req, res) {
        res.render('admin/form_add_news');
    });
    app.post('/news/save', function (req, res) {
        var news = req.body;
        var connection = app.config.DBConnection();
        var newsModel = app.app.models.newsModel;

        newsModel.saveNews(news, connection, function (error, result) {
            if (error) {
                console.error('Error executing query:', error);
                res.status(500).send('Internal Server Error');
                return;
            }
            res.redirect('/news');
        });
    });
};
