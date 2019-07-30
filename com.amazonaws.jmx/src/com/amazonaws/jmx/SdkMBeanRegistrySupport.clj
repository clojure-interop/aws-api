(ns com.amazonaws.jmx.SdkMBeanRegistrySupport
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmx SdkMBeanRegistrySupport]))

(defn ->sdk-m-bean-registry-support
  "Constructor."
  (^SdkMBeanRegistrySupport []
    (new SdkMBeanRegistrySupport )))

(defn register-metric-admin-m-bean
  "Description copied from interface: SdkMBeanRegistry

  object-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^SdkMBeanRegistrySupport this ^java.lang.String object-name]
    (-> this (.registerMetricAdminMBean object-name))))

(defn unregister-m-bean
  "Description copied from interface: SdkMBeanRegistry

  object-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^SdkMBeanRegistrySupport this ^java.lang.String object-name]
    (-> this (.unregisterMBean object-name))))

(defn m-bean-registered?
  "Description copied from interface: SdkMBeanRegistry

  object-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^SdkMBeanRegistrySupport this ^java.lang.String object-name]
    (-> this (.isMBeanRegistered object-name))))

