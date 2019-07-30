(ns com.amazonaws.services.opsworks.AbstractAWSOpsWorksAsync
  "Abstract implementation of AWSOpsWorksAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.opsworks AbstractAWSOpsWorksAsync]))

(defn deregister-ecs-cluster-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterEcsCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterEcsClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest request]
    (-> this (.deregisterEcsClusterAsync request))))

(defn untag-resource-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn unassign-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.UnassignInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnassignInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UnassignInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UnassignInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unassignInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UnassignInstanceRequest request]
    (-> this (.unassignInstanceAsync request))))

(defn describe-ecs-clusters-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEcsClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeEcsClustersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEcsClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest request]
    (-> this (.describeEcsClustersAsync request))))

(defn update-rds-db-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRdsDbInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRdsDbInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest request]
    (-> this (.updateRdsDbInstanceAsync request))))

(defn describe-layers-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeLayersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLayers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeLayersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeLayersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLayersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeLayersRequest request]
    (-> this (.describeLayersAsync request))))

(defn clone-stack-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.CloneStackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CloneStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CloneStackResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CloneStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cloneStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CloneStackRequest request]
    (-> this (.cloneStackAsync request))))

(defn delete-app-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DeleteAppRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeleteAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteAppRequest request]
    (-> this (.deleteAppAsync request))))

(defn describe-operating-systems-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOperatingSystems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOperatingSystemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest request]
    (-> this (.describeOperatingSystemsAsync request))))

(defn describe-instances-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeInstancesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeInstancesRequest request]
    (-> this (.describeInstancesAsync request))))

(defn register-ecs-cluster-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterEcsCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.RegisterEcsClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerEcsClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest request]
    (-> this (.registerEcsClusterAsync request))))

(defn list-tags-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.ListTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.ListTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.ListTagsRequest request]
    (-> this (.listTagsAsync request))))

(defn update-app-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.UpdateAppRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateAppRequest request]
    (-> this (.updateAppAsync request))))

(defn create-layer-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.CreateLayerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLayer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CreateLayerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateLayerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLayerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateLayerRequest request]
    (-> this (.createLayerAsync request))))

(defn stop-stack-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.StopStackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.StopStackResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StopStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StopStackRequest request]
    (-> this (.stopStackAsync request))))

(defn set-time-based-auto-scaling-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetTimeBasedAutoScaling operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setTimeBasedAutoScalingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest request]
    (-> this (.setTimeBasedAutoScalingAsync request))))

(defn unassign-volume-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.UnassignVolumeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnassignVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UnassignVolumeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UnassignVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unassignVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UnassignVolumeRequest request]
    (-> this (.unassignVolumeAsync request))))

(defn describe-elastic-ips-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticIps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeElasticIpsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticIpsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest request]
    (-> this (.describeElasticIpsAsync request))))

(defn describe-permissions-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribePermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribePermissionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribePermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribePermissionsRequest request]
    (-> this (.describePermissionsAsync request))))

(defn describe-volumes-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeVolumesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVolumes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeVolumesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeVolumesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVolumesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeVolumesRequest request]
    (-> this (.describeVolumesAsync request))))

(defn create-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.CreateInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CreateInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateInstanceRequest request]
    (-> this (.createInstanceAsync request))))

(defn associate-elastic-ip-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.AssociateElasticIpRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateElasticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.AssociateElasticIpResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AssociateElasticIpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateElasticIpAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AssociateElasticIpRequest request]
    (-> this (.associateElasticIpAsync request))))

(defn delete-stack-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DeleteStackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeleteStackResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteStackRequest request]
    (-> this (.deleteStackAsync request))))

(defn set-permission-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.SetPermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.SetPermissionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.SetPermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setPermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.SetPermissionRequest request]
    (-> this (.setPermissionAsync request))))

(defn describe-user-profiles-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeUserProfilesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest request]
    (-> this (.describeUserProfilesAsync request))))

(defn describe-time-based-auto-scaling-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTimeBasedAutoScaling operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTimeBasedAutoScalingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest request]
    (-> this (.describeTimeBasedAutoScalingAsync request))))

(defn deregister-elastic-ip-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterElasticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeregisterElasticIpResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterElasticIpAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest request]
    (-> this (.deregisterElasticIpAsync request))))

(defn reboot-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.RebootInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.RebootInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RebootInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RebootInstanceRequest request]
    (-> this (.rebootInstanceAsync request))))

(defn assign-volume-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.AssignVolumeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssignVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.AssignVolumeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AssignVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assignVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AssignVolumeRequest request]
    (-> this (.assignVolumeAsync request))))

(defn grant-access-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.GrantAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GrantAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.GrantAccessResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.GrantAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.grantAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.GrantAccessRequest request]
    (-> this (.grantAccessAsync request))))

(defn stop-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.StopInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.StopInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StopInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StopInstanceRequest request]
    (-> this (.stopInstanceAsync request))))

(defn describe-commands-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeCommandsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCommands operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeCommandsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeCommandsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCommandsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeCommandsRequest request]
    (-> this (.describeCommandsAsync request))))

(defn create-user-profile-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.CreateUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CreateUserProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateUserProfileRequest request]
    (-> this (.createUserProfileAsync request))))

(defn assign-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.AssignInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssignInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.AssignInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AssignInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assignInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AssignInstanceRequest request]
    (-> this (.assignInstanceAsync request))))

(defn get-hostname-suggestion-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHostnameSuggestion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHostnameSuggestionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest request]
    (-> this (.getHostnameSuggestionAsync request))))

(defn describe-stacks-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeStacksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeStacksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeStacksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStacksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeStacksRequest request]
    (-> this (.describeStacksAsync request))))

(defn register-volume-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.RegisterVolumeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.RegisterVolumeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterVolumeRequest request]
    (-> this (.registerVolumeAsync request))))

(defn register-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.RegisterInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.RegisterInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterInstanceRequest request]
    (-> this (.registerInstanceAsync request))))

(defn detach-elastic-load-balancer-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachElasticLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachElasticLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest request]
    (-> this (.detachElasticLoadBalancerAsync request))))

(defn update-elastic-ip-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.UpdateElasticIpRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateElasticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateElasticIpResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateElasticIpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateElasticIpAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateElasticIpRequest request]
    (-> this (.updateElasticIpAsync request))))

(defn delete-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DeleteInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeleteInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteInstanceRequest request]
    (-> this (.deleteInstanceAsync request))))

(defn update-volume-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.UpdateVolumeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateVolumeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateVolumeRequest request]
    (-> this (.updateVolumeAsync request))))

(defn deregister-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DeregisterInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeregisterInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterInstanceRequest request]
    (-> this (.deregisterInstanceAsync request))))

(defn deregister-rds-db-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterRdsDbInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterRdsDbInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest request]
    (-> this (.deregisterRdsDbInstanceAsync request))))

(defn describe-elastic-load-balancers-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticLoadBalancers operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticLoadBalancersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest request]
    (-> this (.describeElasticLoadBalancersAsync request))))

(defn describe-my-user-profile-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMyUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMyUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest request]
    (-> this (.describeMyUserProfileAsync request))))

(defn attach-elastic-load-balancer-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachElasticLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachElasticLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest request]
    (-> this (.attachElasticLoadBalancerAsync request))))

(defn update-layer-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.UpdateLayerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLayer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateLayerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateLayerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLayerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateLayerRequest request]
    (-> this (.updateLayerAsync request))))

(defn describe-load-based-auto-scaling-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBasedAutoScaling operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBasedAutoScalingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest request]
    (-> this (.describeLoadBasedAutoScalingAsync request))))

(defn register-rds-db-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterRdsDbInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerRdsDbInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest request]
    (-> this (.registerRdsDbInstanceAsync request))))

(defn describe-raid-arrays-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRaidArrays operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeRaidArraysResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRaidArraysAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest request]
    (-> this (.describeRaidArraysAsync request))))

(defn describe-agent-versions-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAgentVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAgentVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest request]
    (-> this (.describeAgentVersionsAsync request))))

(defn describe-stack-summary-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackSummary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeStackSummaryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackSummaryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest request]
    (-> this (.describeStackSummaryAsync request))))

(defn describe-service-errors-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServiceErrors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServiceErrorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest request]
    (-> this (.describeServiceErrorsAsync request))))

(defn start-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.StartInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.StartInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StartInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StartInstanceRequest request]
    (-> this (.startInstanceAsync request))))

(defn describe-apps-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeAppsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeAppsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeAppsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAppsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeAppsRequest request]
    (-> this (.describeAppsAsync request))))

(defn update-stack-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.UpdateStackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateStackResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateStackRequest request]
    (-> this (.updateStackAsync request))))

(defn create-stack-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.CreateStackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CreateStackResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateStackRequest request]
    (-> this (.createStackAsync request))))

(defn delete-user-profile-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DeleteUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeleteUserProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteUserProfileRequest request]
    (-> this (.deleteUserProfileAsync request))))

(defn update-instance-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.UpdateInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateInstanceRequest request]
    (-> this (.updateInstanceAsync request))))

(defn set-load-based-auto-scaling-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetLoadBasedAutoScaling operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setLoadBasedAutoScalingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest request]
    (-> this (.setLoadBasedAutoScalingAsync request))))

(defn describe-stack-provisioning-parameters-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackProvisioningParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackProvisioningParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest request]
    (-> this (.describeStackProvisioningParametersAsync request))))

(defn start-stack-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.StartStackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.StartStackResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StartStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StartStackRequest request]
    (-> this (.startStackAsync request))))

(defn update-user-profile-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.UpdateUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateUserProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateUserProfileRequest request]
    (-> this (.updateUserProfileAsync request))))

(defn deregister-volume-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DeregisterVolumeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeregisterVolumeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterVolumeRequest request]
    (-> this (.deregisterVolumeAsync request))))

(defn create-deployment-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.CreateDeploymentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CreateDeploymentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateDeploymentRequest request]
    (-> this (.createDeploymentAsync request))))

(defn register-elastic-ip-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.RegisterElasticIpRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterElasticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.RegisterElasticIpResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterElasticIpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerElasticIpAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterElasticIpRequest request]
    (-> this (.registerElasticIpAsync request))))

(defn update-my-user-profile-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMyUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMyUserProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest request]
    (-> this (.updateMyUserProfileAsync request))))

(defn create-app-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.CreateAppRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CreateAppResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateAppRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAppAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateAppRequest request]
    (-> this (.createAppAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn describe-rds-db-instances-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRdsDbInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRdsDbInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest request]
    (-> this (.describeRdsDbInstancesAsync request))))

(defn describe-deployments-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeDeploymentsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeploymentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest request]
    (-> this (.describeDeploymentsAsync request))))

(defn disassociate-elastic-ip-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateElasticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DisassociateElasticIpResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateElasticIpAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest request]
    (-> this (.disassociateElasticIpAsync request))))

(defn delete-layer-async
  "Description copied from interface: AWSOpsWorksAsync

  request - `com.amazonaws.services.opsworks.model.DeleteLayerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLayer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeleteLayerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteLayerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLayerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteLayerRequest request]
    (-> this (.deleteLayerAsync request))))

