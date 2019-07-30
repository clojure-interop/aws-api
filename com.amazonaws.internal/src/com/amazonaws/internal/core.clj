(ns com.amazonaws.internal.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[com.amazonaws.internal.AmazonWebServiceRequestAdapter])
(require '[com.amazonaws.internal.CRC32MismatchException])
(require '[com.amazonaws.internal.ConnectionUtils])
(require '[com.amazonaws.internal.CredentialsEndpointProvider])
(require '[com.amazonaws.internal.CustomBackoffStrategy])
(require '[com.amazonaws.internal.DateTimeJsonSerializer])
(require '[com.amazonaws.internal.DefaultServiceEndpointBuilder])
(require '[com.amazonaws.internal.DelegateInputStream])
(require '[com.amazonaws.internal.DelegateSSLSocket])
(require '[com.amazonaws.internal.DelegateSocket])
(require '[com.amazonaws.internal.DynamoDBBackoffStrategy])
(require '[com.amazonaws.internal.EC2CredentialsUtils])
(require '[com.amazonaws.internal.EC2MetadataClient])
(require '[com.amazonaws.internal.FIFOCache])
(require '[com.amazonaws.internal.IdentityEndpointBuilder])
(require '[com.amazonaws.internal.ListWithAutoConstructFlag])
(require '[com.amazonaws.internal.MetricAware])
(require '[com.amazonaws.internal.MetricsInputStream])
(require '[com.amazonaws.internal.Releasable])
(require '[com.amazonaws.internal.ReleasableInputStream])
(require '[com.amazonaws.internal.ResettableInputStream])
(require '[com.amazonaws.internal.SdkBufferedInputStream])
(require '[com.amazonaws.internal.SdkDigestInputStream])
(require '[com.amazonaws.internal.SdkFilterInputStream])
(require '[com.amazonaws.internal.SdkFilterOutputStream])
(require '[com.amazonaws.internal.SdkFunction])
(require '[com.amazonaws.internal.SdkInputStream])
(require '[com.amazonaws.internal.SdkInternalList])
(require '[com.amazonaws.internal.SdkInternalMap])
(require '[com.amazonaws.internal.SdkMetricsSocket])
(require '[com.amazonaws.internal.SdkPredicate])
(require '[com.amazonaws.internal.SdkSSLContext])
(require '[com.amazonaws.internal.SdkSSLMetricsSocket])
(require '[com.amazonaws.internal.SdkSSLSocket])
(require '[com.amazonaws.internal.SdkSocket])
(require '[com.amazonaws.internal.SdkThreadLocalsRegistry])
(require '[com.amazonaws.internal.ServiceEndpointBuilder])
(require '[com.amazonaws.internal.StaticCredentialsProvider])
