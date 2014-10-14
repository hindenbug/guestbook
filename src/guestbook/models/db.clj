(ns guestbook.models.db
  (:require [monger.core :as mg]
            [monger.collection :as mc])
  (:import org.bson.types.ObjectId))

(def conn
  (mg/get-db (mg/connect) "monger-test"))


;; find-maps to return all mongo records as clojure maps
(defn read-guests []
  (mc/find-maps conn "users"))

(defn save-message [name message]
  (mc/insert conn "users" {:name name, :message message, :timestamp (new java.util.Date) }))
