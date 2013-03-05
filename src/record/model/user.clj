(ns record.model.user
  (:require clj-record.boot))
(def db {:classname "com.mysql.jdbc.Driver"
         :subprotocol "mysql"
         :user "root"
         :password ""
         :subname "//localhost/clojure"})

(clj-record.core/init-model)

