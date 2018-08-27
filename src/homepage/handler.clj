(ns homepage.handler
  (:require [homepage.routes :refer [homepage-routes]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(def app
  (wrap-defaults homepage-routes site-defaults))