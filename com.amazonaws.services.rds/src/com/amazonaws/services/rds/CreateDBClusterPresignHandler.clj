(ns com.amazonaws.services.rds.CreateDBClusterPresignHandler
  "Handler for pre-signing CreateDBClusterRequest."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rds CreateDBClusterPresignHandler]))

(defn ->create-db-cluster-presign-handler
  "Constructor."
  (^CreateDBClusterPresignHandler []
    (new CreateDBClusterPresignHandler )))

(defn before-request
  "Description copied from interface: IRequestHandler2

  request - The low level request being processed. - `com.amazonaws.Request`"
  ([^CreateDBClusterPresignHandler this ^com.amazonaws.Request request]
    (-> this (.beforeRequest request))))

