(ns homepage.routes
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [homepage.views :as v]))
        
(defroutes homepage-routes
  (GET "/" [] (v/index))
  (route/not-found "Not Found"))
