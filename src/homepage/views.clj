(ns homepage.views
    (:require [hiccup.page :refer [html5]]))

(defn index
    []
    (html5 [:head [:title "homepage"] [:style "body {background: #111111; position: absolute; top: 50%; left: 50%; margin-right: -50%; transform: translate(-50%, -50%)}"]]
           [:body [:img {:src "img/pic.jpg"}]]))