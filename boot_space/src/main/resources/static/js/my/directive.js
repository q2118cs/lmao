/**
 * Created by 孙瑞 on 2017/2/10.
 */
actionApp.directive('datePicker', function () {
    return {
        restrict: 'AC',
        link: function (scope, element, attrs) {
            element.datepicker();
        }
    }
});