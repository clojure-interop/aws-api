(ns com.amazonaws.log.JulLogFactory
  "Internal logging factory for the signers and core classes based on JUL."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.log JulLogFactory]))

(defn ->jul-log-factory
  "Constructor."
  (^JulLogFactory []
    (new JulLogFactory )))

