(ns com.amazonaws.services.signer.AbstractAWSsignerAsync
  "Abstract implementation of AWSsignerAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.signer AbstractAWSsignerAsync]))

(defn cancel-signing-profile-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.CancelSigningProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSigningProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.CancelSigningProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.CancelSigningProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelSigningProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.CancelSigningProfileRequest request]
    (-> this (.cancelSigningProfileAsync request))))

(defn get-signing-platform-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.GetSigningPlatformRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSigningPlatform operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.GetSigningPlatformResult>`"
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.GetSigningPlatformRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSigningPlatformAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.GetSigningPlatformRequest request]
    (-> this (.getSigningPlatformAsync request))))

(defn list-signing-profiles-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.ListSigningProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSigningProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.ListSigningProfilesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.ListSigningProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSigningProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.ListSigningProfilesRequest request]
    (-> this (.listSigningProfilesAsync request))))

(defn describe-signing-job-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.DescribeSigningJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSigningJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.DescribeSigningJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.DescribeSigningJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSigningJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.DescribeSigningJobRequest request]
    (-> this (.describeSigningJobAsync request))))

(defn get-signing-profile-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.GetSigningProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSigningProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.GetSigningProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.GetSigningProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSigningProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.GetSigningProfileRequest request]
    (-> this (.getSigningProfileAsync request))))

(defn start-signing-job-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.StartSigningJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSigningJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.StartSigningJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.StartSigningJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSigningJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.StartSigningJobRequest request]
    (-> this (.startSigningJobAsync request))))

(defn put-signing-profile-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.PutSigningProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSigningProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.PutSigningProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.PutSigningProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSigningProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.PutSigningProfileRequest request]
    (-> this (.putSigningProfileAsync request))))

(defn list-signing-jobs-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.ListSigningJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSigningJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.ListSigningJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.ListSigningJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSigningJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.ListSigningJobsRequest request]
    (-> this (.listSigningJobsAsync request))))

(defn list-signing-platforms-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.ListSigningPlatformsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSigningPlatforms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.ListSigningPlatformsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.ListSigningPlatformsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSigningPlatformsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSsignerAsync this ^com.amazonaws.services.signer.model.ListSigningPlatformsRequest request]
    (-> this (.listSigningPlatformsAsync request))))

