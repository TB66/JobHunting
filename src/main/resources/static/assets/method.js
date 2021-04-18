function login() {
    account = document.getElementById("account").value;
    passwd = document.getElementById("password").value;
    document.getElementById("password").value = calcMD5(passwd);
    this.$axios({
        method: 'post',
        url: '/user/login.do',
        data: {
            user: {}
        }
    }).then(function (res) {
        console.log(res);
    });

}