
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '幼儿园信息',
	url: './pages/youeryuanxinxi/list.jsp'
}, 
{
	name: '活动信息',
	url: './pages/huodongxinxi/list.jsp'
}, 
{
	name: '就餐信息',
	url: './pages/jiucanxinxi/list.jsp'
}, 

]

var adminurl =  "http://localhost:8080/jspm1m341/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["查看","审核","缴费"],"menu":"学生信息","menuJump":"列表","tableName":"xueshengxinxi"}],"menu":"学生信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"缴费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"缴费信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"幼儿园信息","menuJump":"列表","tableName":"youeryuanxinxi"}],"menu":"幼儿园信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师信息","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教师信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"考勤信息","menuJump":"列表","tableName":"kaoqinxinxi"}],"menu":"考勤信息管理"},{"child":[{"buttons":["查看","审核"],"menu":"考勤申请","menuJump":"列表","tableName":"kaoqinshenqing"}],"menu":"考勤申请管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"活动信息","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"就餐信息","menuJump":"列表","tableName":"jiucanxinxi"}],"menu":"就餐信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"幼儿园信息列表","menuJump":"列表","tableName":"youeryuanxinxi"}],"menu":"幼儿园信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"活动信息列表","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"就餐信息列表","menuJump":"列表","tableName":"jiucanxinxi"}],"menu":"就餐信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生信息","menuJump":"列表","tableName":"xueshengxinxi"}],"menu":"学生信息管理"},{"child":[{"buttons":["查看"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"buttons":["查看","支付"],"menu":"缴费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"缴费信息管理"},{"child":[{"buttons":["查看"],"menu":"幼儿园信息","menuJump":"列表","tableName":"youeryuanxinxi"}],"menu":"幼儿园信息管理"},{"child":[{"buttons":["查看"],"menu":"教师信息","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教师信息管理"},{"child":[{"buttons":["查看","考勤"],"menu":"考勤信息","menuJump":"列表","tableName":"kaoqinxinxi"}],"menu":"考勤信息管理"},{"child":[{"buttons":["修改","查看","删除"],"menu":"考勤申请","menuJump":"列表","tableName":"kaoqinshenqing"}],"menu":"考勤申请管理"},{"child":[{"buttons":["查看"],"menu":"活动信息","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息管理"},{"child":[{"buttons":["查看"],"menu":"就餐信息","menuJump":"列表","tableName":"jiucanxinxi"}],"menu":"就餐信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"幼儿园信息列表","menuJump":"列表","tableName":"youeryuanxinxi"}],"menu":"幼儿园信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"活动信息列表","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"就餐信息列表","menuJump":"列表","tableName":"jiucanxinxi"}],"menu":"就餐信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
