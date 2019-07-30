(ns com.amazonaws.services.directconnect.AbstractAmazonDirectConnectAsync
  "Abstract implementation of AmazonDirectConnectAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.directconnect AbstractAmazonDirectConnectAsync]))

(defn update-lag-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.UpdateLagRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.UpdateLagResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UpdateLagRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLagAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UpdateLagRequest request]
    (-> this (.updateLagAsync request))))

(defn describe-virtual-gateways-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVirtualGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVirtualGatewaysAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest request]
    (-> this (.describeVirtualGatewaysAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this]
    (-> this (.describeVirtualGatewaysAsync))))

(defn untag-resource-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn update-virtual-interface-attributes-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVirtualInterfaceAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVirtualInterfaceAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesRequest request]
    (-> this (.updateVirtualInterfaceAttributesAsync request))))

(defn delete-direct-connect-gateway-association-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDirectConnectGatewayAssociation operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDirectConnectGatewayAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest request]
    (-> this (.deleteDirectConnectGatewayAssociationAsync request))))

(defn create-lag-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.CreateLagRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateLagResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateLagRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLagAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateLagRequest request]
    (-> this (.createLagAsync request))))

(defn delete-direct-connect-gateway-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDirectConnectGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDirectConnectGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest request]
    (-> this (.deleteDirectConnectGatewayAsync request))))

(defn confirm-private-virtual-interface-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmPrivateVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmPrivateVirtualInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest request]
    (-> this (.confirmPrivateVirtualInterfaceAsync request))))

(defn delete-lag-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DeleteLagRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteLagResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteLagRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLagAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteLagRequest request]
    (-> this (.deleteLagAsync request))))

(defn accept-direct-connect-gateway-association-proposal-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptDirectConnectGatewayAssociationProposal operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptDirectConnectGatewayAssociationProposalAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalRequest request]
    (-> this (.acceptDirectConnectGatewayAssociationProposalAsync request))))

(defn allocate-private-virtual-interface-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocatePrivateVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocatePrivateVirtualInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest request]
    (-> this (.allocatePrivateVirtualInterfaceAsync request))))

(defn create-direct-connect-gateway-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDirectConnectGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDirectConnectGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest request]
    (-> this (.createDirectConnectGatewayAsync request))))

(defn describe-direct-connect-gateway-association-proposals-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDirectConnectGatewayAssociationProposals operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDirectConnectGatewayAssociationProposalsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsRequest request]
    (-> this (.describeDirectConnectGatewayAssociationProposalsAsync request))))

(defn describe-virtual-interfaces-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVirtualInterfaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVirtualInterfacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest request]
    (-> this (.describeVirtualInterfacesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this]
    (-> this (.describeVirtualInterfacesAsync))))

(defn describe-lags-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeLagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeLagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeLagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeLagsRequest request]
    (-> this (.describeLagsAsync request))))

(defn confirm-public-virtual-interface-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmPublicVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmPublicVirtualInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest request]
    (-> this (.confirmPublicVirtualInterfaceAsync request))))

(defn describe-direct-connect-gateway-attachments-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDirectConnectGatewayAttachments operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDirectConnectGatewayAttachmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest request]
    (-> this (.describeDirectConnectGatewayAttachmentsAsync request))))

(defn describe-loa-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeLoaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoa operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeLoaResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeLoaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoaAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeLoaRequest request]
    (-> this (.describeLoaAsync request))))

(defn create-direct-connect-gateway-association-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDirectConnectGatewayAssociation operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDirectConnectGatewayAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest request]
    (-> this (.createDirectConnectGatewayAssociationAsync request))))

(defn create-interconnect-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.CreateInterconnectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInterconnect operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateInterconnectResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateInterconnectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInterconnectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateInterconnectRequest request]
    (-> this (.createInterconnectAsync request))))

(defn delete-connection-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DeleteConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteConnectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteConnectionRequest request]
    (-> this (.deleteConnectionAsync request))))

(defn create-public-virtual-interface-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePublicVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPublicVirtualInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest request]
    (-> this (.createPublicVirtualInterfaceAsync request))))

(defn associate-connection-with-lag-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateConnectionWithLag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AssociateConnectionWithLagResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateConnectionWithLagAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest request]
    (-> this (.associateConnectionWithLagAsync request))))

(defn allocate-public-virtual-interface-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocatePublicVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocatePublicVirtualInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest request]
    (-> this (.allocatePublicVirtualInterfaceAsync request))))

(defn create-direct-connect-gateway-association-proposal-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDirectConnectGatewayAssociationProposal operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDirectConnectGatewayAssociationProposalAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalRequest request]
    (-> this (.createDirectConnectGatewayAssociationProposalAsync request))))

(defn create-private-virtual-interface-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePrivateVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPrivateVirtualInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest request]
    (-> this (.createPrivateVirtualInterfaceAsync request))))

(defn describe-interconnect-loa-async
  "Deprecated.

  request - `com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInterconnectLoa operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeInterconnectLoaResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInterconnectLoaAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest request]
    (-> this (.describeInterconnectLoaAsync request))))

(defn create-bgp-peer-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.CreateBGPPeerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBGPPeer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateBGPPeerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateBGPPeerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBGPPeerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateBGPPeerRequest request]
    (-> this (.createBGPPeerAsync request))))

(defn describe-connections-on-interconnect-async
  "Deprecated.

  request - `com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConnectionsOnInterconnect operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConnectionsOnInterconnectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest request]
    (-> this (.describeConnectionsOnInterconnectAsync request))))

(defn delete-interconnect-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DeleteInterconnectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInterconnect operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteInterconnectResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteInterconnectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInterconnectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteInterconnectRequest request]
    (-> this (.deleteInterconnectAsync request))))

(defn associate-hosted-connection-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateHostedConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AssociateHostedConnectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateHostedConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest request]
    (-> this (.associateHostedConnectionAsync request))))

(defn confirm-connection-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.ConfirmConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.ConfirmConnectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmConnectionRequest request]
    (-> this (.confirmConnectionAsync request))))

(defn allocate-hosted-connection-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocateHostedConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AllocateHostedConnectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocateHostedConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest request]
    (-> this (.allocateHostedConnectionAsync request))))

(defn describe-connection-loa-async
  "Deprecated.

  request - `com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConnectionLoa operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeConnectionLoaResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConnectionLoaAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest request]
    (-> this (.describeConnectionLoaAsync request))))

(defn disassociate-connection-from-lag-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateConnectionFromLag operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateConnectionFromLagAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest request]
    (-> this (.disassociateConnectionFromLagAsync request))))

(defn describe-connections-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeConnectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConnections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeConnectionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeConnectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConnectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeConnectionsRequest request]
    (-> this (.describeConnectionsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this]
    (-> this (.describeConnectionsAsync))))

(defn delete-bgp-peer-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBGPPeer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteBGPPeerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBGPPeerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest request]
    (-> this (.deleteBGPPeerAsync request))))

(defn allocate-transit-virtual-interface-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocateTransitVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocateTransitVirtualInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceRequest request]
    (-> this (.allocateTransitVirtualInterfaceAsync request))))

(defn describe-tags-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeTagsRequest request]
    (-> this (.describeTagsAsync request))))

(defn describe-locations-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeLocationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLocations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeLocationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeLocationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLocationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeLocationsRequest request]
    (-> this (.describeLocationsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this]
    (-> this (.describeLocationsAsync))))

(defn confirm-transit-virtual-interface-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmTransitVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmTransitVirtualInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceRequest request]
    (-> this (.confirmTransitVirtualInterfaceAsync request))))

(defn create-connection-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.CreateConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateConnectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateConnectionRequest request]
    (-> this (.createConnectionAsync request))))

(defn describe-hosted-connections-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHostedConnections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeHostedConnectionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHostedConnectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest request]
    (-> this (.describeHostedConnectionsAsync request))))

(defn describe-direct-connect-gateway-associations-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDirectConnectGatewayAssociations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDirectConnectGatewayAssociationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest request]
    (-> this (.describeDirectConnectGatewayAssociationsAsync request))))

(defn associate-virtual-interface-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateVirtualInterface operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateVirtualInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest request]
    (-> this (.associateVirtualInterfaceAsync request))))

(defn describe-interconnects-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInterconnects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeInterconnectsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInterconnectsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest request]
    (-> this (.describeInterconnectsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this]
    (-> this (.describeInterconnectsAsync))))

(defn tag-resource-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn create-transit-virtual-interface-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTransitVirtualInterface operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTransitVirtualInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceRequest request]
    (-> this (.createTransitVirtualInterfaceAsync request))))

(defn allocate-connection-on-interconnect-async
  "Deprecated.

  request - `com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocateConnectionOnInterconnect operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocateConnectionOnInterconnectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest request]
    (-> this (.allocateConnectionOnInterconnectAsync request))))

(defn delete-virtual-interface-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVirtualInterface operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVirtualInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest request]
    (-> this (.deleteVirtualInterfaceAsync request))))

(defn update-direct-connect-gateway-association-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDirectConnectGatewayAssociation operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDirectConnectGatewayAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationRequest request]
    (-> this (.updateDirectConnectGatewayAssociationAsync request))))

(defn delete-direct-connect-gateway-association-proposal-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDirectConnectGatewayAssociationProposal operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDirectConnectGatewayAssociationProposalAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalRequest request]
    (-> this (.deleteDirectConnectGatewayAssociationProposalAsync request))))

(defn describe-direct-connect-gateways-async
  "Description copied from interface: AmazonDirectConnectAsync

  request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDirectConnectGateways operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDirectConnectGatewaysAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDirectConnectAsync this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest request]
    (-> this (.describeDirectConnectGatewaysAsync request))))

