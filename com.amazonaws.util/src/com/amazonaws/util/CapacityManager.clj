(ns com.amazonaws.util.CapacityManager
  "Manages capacity of a finite resource.  Capacity can be acquired and
  released."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util CapacityManager]))

(defn ->capacity-manager
  "Constructor.

  Creates a CapacityManager.

  max-capacity - maximum capacity of this resource. available capacity will initially be set to this value. if a negative value is provided the capacity manager will operate in a no-op passthrough mode in which all acquire calls will return true. - `int`"
  (^CapacityManager [^Integer max-capacity]
    (new CapacityManager max-capacity)))

(defn acquire
  "Attempts to acquire a given amount of capacity.
   If acquired, capacity will be consumed from the available pool.

  capacity - capacity to acquire - `int`

  returns: true if capacity can be acquired, false if not - `boolean`

  throws: java.lang.IllegalArgumentException - if given capacity is negative"
  (^Boolean [^CapacityManager this ^Integer capacity]
    (-> this (.acquire capacity)))
  (^Boolean [^CapacityManager this]
    (-> this (.acquire))))

(defn release
  "Releases a given amount of capacity back to the pool, making it available
   to consumers.

  capacity - capacity to release - `int`

  throws: java.lang.IllegalArgumentException - if given capacity is negative"
  ([^CapacityManager this ^Integer capacity]
    (-> this (.release capacity)))
  ([^CapacityManager this]
    (-> this (.release))))

(defn consumed-capacity
  "Returns the currently consumed capacity.

  returns: consumed capacity - `int`"
  (^Integer [^CapacityManager this]
    (-> this (.consumedCapacity))))

(defn available-capacity
  "Returns the currently available capacity.

  returns: available capacity - `int`"
  (^Integer [^CapacityManager this]
    (-> this (.availableCapacity))))

