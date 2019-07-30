(ns com.amazonaws.services.rds.CreateDBInstanceReadReplicaPresignHandler
  "Handler for pre-signing CreateDBInstanceReadReplicaRequest."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rds CreateDBInstanceReadReplicaPresignHandler]))

(defn ->create-db-instance-read-replica-presign-handler
  "Constructor."
  (^CreateDBInstanceReadReplicaPresignHandler []
    (new CreateDBInstanceReadReplicaPresignHandler )))

(defn before-request
  "Description copied from interface: IRequestHandler2

  request - The low level request being processed. - `com.amazonaws.Request`"
  ([^CreateDBInstanceReadReplicaPresignHandler this ^com.amazonaws.Request request]
    (-> this (.beforeRequest request))))

