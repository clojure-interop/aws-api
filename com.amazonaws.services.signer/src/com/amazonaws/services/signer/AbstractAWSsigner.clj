(ns com.amazonaws.services.signer.AbstractAWSsigner
  "Abstract implementation of AWSsigner. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.signer AbstractAWSsigner]))

(defn start-signing-job
  "Description copied from interface: AWSsigner

  request - `com.amazonaws.services.signer.model.StartSigningJobRequest`

  returns: Result of the StartSigningJob operation returned by the service. - `com.amazonaws.services.signer.model.StartSigningJobResult`"
  (^com.amazonaws.services.signer.model.StartSigningJobResult [^AbstractAWSsigner this ^com.amazonaws.services.signer.model.StartSigningJobRequest request]
    (-> this (.startSigningJob request))))

(defn waiters
  "returns: `com.amazonaws.services.signer.waiters.AWSsignerWaiters`"
  (^com.amazonaws.services.signer.waiters.AWSsignerWaiters [^AbstractAWSsigner this]
    (-> this (.waiters))))

(defn get-signing-profile
  "Description copied from interface: AWSsigner

  request - `com.amazonaws.services.signer.model.GetSigningProfileRequest`

  returns: Result of the GetSigningProfile operation returned by the service. - `com.amazonaws.services.signer.model.GetSigningProfileResult`"
  (^com.amazonaws.services.signer.model.GetSigningProfileResult [^AbstractAWSsigner this ^com.amazonaws.services.signer.model.GetSigningProfileRequest request]
    (-> this (.getSigningProfile request))))

(defn put-signing-profile
  "Description copied from interface: AWSsigner

  request - `com.amazonaws.services.signer.model.PutSigningProfileRequest`

  returns: Result of the PutSigningProfile operation returned by the service. - `com.amazonaws.services.signer.model.PutSigningProfileResult`"
  (^com.amazonaws.services.signer.model.PutSigningProfileResult [^AbstractAWSsigner this ^com.amazonaws.services.signer.model.PutSigningProfileRequest request]
    (-> this (.putSigningProfile request))))

(defn describe-signing-job
  "Description copied from interface: AWSsigner

  request - `com.amazonaws.services.signer.model.DescribeSigningJobRequest`

  returns: Result of the DescribeSigningJob operation returned by the service. - `com.amazonaws.services.signer.model.DescribeSigningJobResult`"
  (^com.amazonaws.services.signer.model.DescribeSigningJobResult [^AbstractAWSsigner this ^com.amazonaws.services.signer.model.DescribeSigningJobRequest request]
    (-> this (.describeSigningJob request))))

(defn list-signing-profiles
  "Description copied from interface: AWSsigner

  request - `com.amazonaws.services.signer.model.ListSigningProfilesRequest`

  returns: Result of the ListSigningProfiles operation returned by the service. - `com.amazonaws.services.signer.model.ListSigningProfilesResult`"
  (^com.amazonaws.services.signer.model.ListSigningProfilesResult [^AbstractAWSsigner this ^com.amazonaws.services.signer.model.ListSigningProfilesRequest request]
    (-> this (.listSigningProfiles request))))

(defn list-signing-jobs
  "Description copied from interface: AWSsigner

  request - `com.amazonaws.services.signer.model.ListSigningJobsRequest`

  returns: Result of the ListSigningJobs operation returned by the service. - `com.amazonaws.services.signer.model.ListSigningJobsResult`"
  (^com.amazonaws.services.signer.model.ListSigningJobsResult [^AbstractAWSsigner this ^com.amazonaws.services.signer.model.ListSigningJobsRequest request]
    (-> this (.listSigningJobs request))))

(defn list-signing-platforms
  "Description copied from interface: AWSsigner

  request - `com.amazonaws.services.signer.model.ListSigningPlatformsRequest`

  returns: Result of the ListSigningPlatforms operation returned by the service. - `com.amazonaws.services.signer.model.ListSigningPlatformsResult`"
  (^com.amazonaws.services.signer.model.ListSigningPlatformsResult [^AbstractAWSsigner this ^com.amazonaws.services.signer.model.ListSigningPlatformsRequest request]
    (-> this (.listSigningPlatforms request))))

(defn shutdown
  "Description copied from interface: AWSsigner"
  ([^AbstractAWSsigner this]
    (-> this (.shutdown))))

(defn get-signing-platform
  "Description copied from interface: AWSsigner

  request - `com.amazonaws.services.signer.model.GetSigningPlatformRequest`

  returns: Result of the GetSigningPlatform operation returned by the service. - `com.amazonaws.services.signer.model.GetSigningPlatformResult`"
  (^com.amazonaws.services.signer.model.GetSigningPlatformResult [^AbstractAWSsigner this ^com.amazonaws.services.signer.model.GetSigningPlatformRequest request]
    (-> this (.getSigningPlatform request))))

(defn cancel-signing-profile
  "Description copied from interface: AWSsigner

  request - `com.amazonaws.services.signer.model.CancelSigningProfileRequest`

  returns: Result of the CancelSigningProfile operation returned by the service. - `com.amazonaws.services.signer.model.CancelSigningProfileResult`"
  (^com.amazonaws.services.signer.model.CancelSigningProfileResult [^AbstractAWSsigner this ^com.amazonaws.services.signer.model.CancelSigningProfileRequest request]
    (-> this (.cancelSigningProfile request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSsigner

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSsigner this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

