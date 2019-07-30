(ns com.amazonaws.http.IdleConnectionReaper
  "Daemon thread to periodically check connection pools for idle connections.

  Connections sitting around idle in the HTTP connection pool for too long will
  eventually be terminated by the AWS end of the connection, and will go into
  CLOSE_WAIT. If this happens, sockets will sit around in CLOSE_WAIT, still
  using resources on the client side to manage that socket. Many sockets stuck
  in CLOSE_WAIT can prevent the OS from creating new connections.

  This class closes idle connections before they can move into the CLOSE_WAIT
  state.

  This thread is important because by default, we disable Apache HttpClient's
  stale connection checking, so without this thread running in the background,
  cleaning up old/inactive HTTP connections, we'd see more IO exceptions when
  stale connections (i.e. closed on the AWS side) are left in the connection
  pool, and requests grab one of them to begin executing a request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http IdleConnectionReaper]))

(defn *register-connection-manager
  "Registers the given connection manager with this reaper;

  connection-manager - Connection manager to register - `org.apache.http.conn.HttpClientConnectionManager`
  max-idle-in-ms - Max idle connection timeout in milliseconds for this connection manager. - `long`

  returns: true if the connection manager has been successfully registered; false otherwise. - `boolean`"
  (^Boolean [^org.apache.http.conn.HttpClientConnectionManager connection-manager ^Long max-idle-in-ms]
    (IdleConnectionReaper/registerConnectionManager connection-manager max-idle-in-ms))
  (^Boolean [^org.apache.http.conn.HttpClientConnectionManager connection-manager]
    (IdleConnectionReaper/registerConnectionManager connection-manager)))

(defn *remove-connection-manager
  "Removes the given connection manager from this reaper,
   and shutting down the reaper if there is zero connection manager left.

  connection-manager - `org.apache.http.conn.HttpClientConnectionManager`

  returns: true if the connection manager has been successfully removed;
   false otherwise. - `boolean`"
  (^Boolean [^org.apache.http.conn.HttpClientConnectionManager connection-manager]
    (IdleConnectionReaper/removeConnectionManager connection-manager)))

(defn *get-registered-connection-managers
  "returns: `java.util.List<org.apache.http.conn.HttpClientConnectionManager>`"
  (^java.util.List []
    (IdleConnectionReaper/getRegisteredConnectionManagers )))

(defn *shutdown
  "Shuts down the thread, allowing the class and instance to be collected.

   Since this is a daemon thread, its running will not prevent JVM shutdown.
   It will, however, prevent this class from being unloaded or garbage
   collected, in the context of a long-running application, until it is
   interrupted. This method will stop the thread's execution and clear its
   state. Any use of a service client will cause the thread to be restarted.

  returns: true if an actual shutdown has been made; false otherwise. - `boolean`"
  (^Boolean []
    (IdleConnectionReaper/shutdown )))

(defn run
  ""
  ([^IdleConnectionReaper this]
    (-> this (.run))))

