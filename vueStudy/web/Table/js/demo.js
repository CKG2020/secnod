





new Vue({
    el: "#demo",

    data: {
        result1: null,
        result2: null,
        input2: ""
    },

    created: function() {
        // the created hook is called after the instance is created
    },

    methods: {
        test1: function () {
            this.result1 = this.$refs.input1.value + " 成功!";
        },

        test2: function () {
            this.result2 = this.input2 + " 成功!";
        }
    }
})